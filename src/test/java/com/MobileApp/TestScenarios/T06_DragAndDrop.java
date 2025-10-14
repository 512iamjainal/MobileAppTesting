package com.MobileApp.TestScenarios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MobileApp.Utility.DriverUtil;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class T06_DragAndDrop {
  @Test
  public void testDragGesture() throws InterruptedException 
  {
	  //create driver session
	  AppiumDriver driver = DriverUtil.initAndroidDriverSession();
	  
	  //click on views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //click on drag and drop
	  driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	  
	  //identify dot1
	  WebElement ele = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
	  
	  //drag gesture
	  driver.executeScript("mobile:dragGesture", ImmutableMap.of(
			  "elementId", ((RemoteWebElement) ele).getId(),
			  "endX",370,
			  "endY",1680
			  ));
	  
	  //verify message
	  String exp = "Dropped!";
	  String act = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text")).getText();
	  
	  Assert.assertEquals(exp,  act);
	  System.out.println("Result text is: "+ act);
  }
}
