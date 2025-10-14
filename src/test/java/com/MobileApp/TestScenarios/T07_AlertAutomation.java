package com.MobileApp.TestScenarios;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.MobileApp.Utility.DriverUtil;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class T07_AlertAutomation {
	/*
	 * Alert is interface
	 * Types:
	 * -----------------------
	 * 1. Simple alert (with OK button)
	 * 2. Confirmation alert (with ok and cancel button)
	 * 3. Prompt alert
	 * 
	 * OK- accept()
	 * cancel - dismiss()
	 * prompt - sendKeys()
	 * to get text : getText()
	 */
  @Test
  public void testAlerts() 
  {
	  //create driver session
	  AppiumDriver driver = DriverUtil.initAndroidDriverSession();
	  
	  //click on app
	  driver.findElement(AppiumBy.accessibilityId("App")).click();
	  
	  //click alert
	  driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
	  
	  //open alert on clicking this element
	  driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
	  
	  //alert will open - switch to alert
	  Alert alt1 = driver.switchTo().alert();
	  
	  System.out.println("Text of alert 1 is: " + alt1.getText());
	  
	  //ok
	  alt1.accept();
  }	
}
