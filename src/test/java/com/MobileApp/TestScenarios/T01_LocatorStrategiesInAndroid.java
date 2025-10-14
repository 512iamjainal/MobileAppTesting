package com.MobileApp.TestScenarios;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.MobileApp.Utility.DriverUtil;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class T01_LocatorStrategiesInAndroid {
  @Test
  public void testLocators() throws InterruptedException 
  {
	  //create appiumdriver session 
	  AppiumDriver driver = DriverUtil.initAndroidDriverSession();
	  
	  //locator strategy1: Accessibility id (primary locator in appium)
	  WebElement ele1= driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
	  System.out.println("Text of element1: "+ele1.getText());
	  ele1.click();
		
	  Thread.sleep(2000);
	  
	  //navigate back to previous page
	  driver.navigate().back();
	  
	  //locator strategy1: xpath
	  WebElement ele2 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Animation\"]"));
	  System.out.println("Text of element 2: "+ele2.getText());
	  ele2.click();
		
	  Thread.sleep(2000);
	  
	  //navigate back to previous page
	  driver.navigate().back();
	  
	  //locator strategy3: className
	  WebElement ele3 = driver.findElements(AppiumBy.className("android.widget.TextView")).get(4);
	  System.out.println("Text of element 3: " + ele3.getText());
	  ele3.click();
	  
	  Thread.sleep(2000);
	  
	  //navigate back to previous page
	  driver.navigate().back();
	  
	  //locator strategy4: -android uiautomator(docs)
	  WebElement ele4 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Content\")"));
	  System.out.println("Text of element 4: "+ele4.getText());
	  ele4.click();
		
	  Thread.sleep(2000);
	  
	  //navigate back to previous page
	  driver.navigate().back();
	  
	  //locator strategy5: resource-id
	  WebElement ele5 = driver.findElements(AppiumBy.id("android:id/text1")).get(11);
	  System.out.println("Text of element 5: "+ele5.getText());
	  ele5.click();
		
	  Thread.sleep(2000);
	  
	  //navigate back to previous page
	  driver.navigate().back();
	  
  }
}
