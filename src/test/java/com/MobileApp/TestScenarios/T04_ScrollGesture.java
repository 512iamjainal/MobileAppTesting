package com.MobileApp.TestScenarios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.MobileApp.Utility.AppUtil;
import com.MobileApp.Utility.DriverUtil;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class T04_ScrollGesture {
  @Test
  public void testScrollGesture() throws InterruptedException 
  {
	  //create driver session
	  AppiumDriver driver = DriverUtil.initAndroidDriverSession();
	  
	  //click on views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //get the page area
	  WebElement pageArea = driver.findElement(AppiumBy.id("android:id/list"));
	  
	  //scroll
	  AppUtil.scrollDown(driver, pageArea);
	  
	  Thread.sleep(2000);
	  
	  AppUtil.scrollUp(driver, pageArea);
	  
	  //AppUtil.scrollDownUptoCount(driver, pageArea, 3);
  }
}
