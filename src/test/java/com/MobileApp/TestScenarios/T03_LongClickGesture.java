package com.MobileApp.TestScenarios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.MobileApp.Utility.AppUtil;
import com.MobileApp.Utility.DriverUtil;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class T03_LongClickGesture {
  @Test
  public void testLongClickGesture() throws InterruptedException 
  {
	  //create driver session
	  AppiumDriver driver = DriverUtil.initAndroidDriverSession();
	  
	  AppUtil.getScreenshot(driver, "homepage");
	  
	  //click on views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  AppUtil.getScreenshot(driver, "viewpage");
	  Thread.sleep(1000);
	  
	  //click on drag and drop
	  driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	  Thread.sleep(1000);
	  AppUtil.getScreenshot(driver, "dotpage");
	  
	  //identify dot1
	  WebElement ele = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
	  
	  //longClickGesture
	  driver.executeScript("mobile:longClickGesture", ImmutableMap.of(
			  "elementId", ((RemoteWebElement) ele).getId(),
			  "duration", 4000
			  ));
	  
	  System.out.println("Long click gesture is completed!");
  }
}
