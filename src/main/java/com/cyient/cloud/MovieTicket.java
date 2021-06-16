package com.cyient.cloud;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.net.MalformedURLException;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MovieTicket {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	    
			        DesiredCapabilities caps = new DesiredCapabilities();
	            
	            
	            // Set your access credentials
			        caps.setCapability("browserstack.user", "dhusarrakshar_gdibnS");
			        caps.setCapability("browserstack.key", "gGr67EmdRxEHWFtxRLnH");
			        
			        // Set URL of the application under test
			        caps.setCapability("app", "bs://61878da36dcfa1849df33509d43a9e268ccdb1d0");
	            
	            // Specify device and os_version for testing
	            caps.setCapability("device", "Google Pixel 3");
	            caps.setCapability("os_version", "9.0");
	              
	            // Set other BrowserStack capabilities
	            caps.setCapability("project", "First Java Project");
	            caps.setCapability("build", "Java Android");
	            caps.setCapability("name", "first_test");
	              
	            
	            // Initialise the remote Webdriver using BrowserStack remote URL
	            // and desired capabilities defined above
	              AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
	                  new URL("http://hub.browserstack.com/wd/hub"), caps);	        
	        
	        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			//driver.get("https://www.pepperfry.com/");
			//1stCase
	      Thread.sleep(1000);
	      
	      //driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView\r\n"
	      		//+ "").click();  
	        driver.findElementByXPath("//*[@resource-id='com.net.pvr:id/tvSkip']").click();
	     //sign in button   
	  driver.findElementByXPath("//*[@resource-id='com.net.pvr:id/allReadyAMemberTextView']").click();
	  

	      driver.findElementByAndroidUIAutomator("UiSelector().text(\"Mobile Number\")").sendKeys("3456765448");	
			
			driver.findElementByAndroidUIAutomator("UiSelector().text(\"Password\")").sendKeys("Raksha123");
			  driver.findElementByXPath("//*[@resource-id='com.net.pvr:id/allReadyAMemberTextView']").click();
			  driver.findElementByXPath("//*[@resource-id='com.net.pvr:id/continueBtn']").click();
			  
			 //2nd Case
			  driver.findElementByXPath("//*[@resource-id='com.net.pvr:id/skipTextView']").click(); 
			 driver.findElementByXPath("//*[@resource-id='com.net.pvr:id/noThanksTextView']").click(); 
			  
			 // driver.findElementByXPath("//*[@text='Register']").click();
			  driver.findElementByXPath("//*[@resource-id='com.net.pvr:id/cityNameTextView']").click();
			  driver.findElementByXPath("//*[@resource-id='com.net.pvr:id/searchBtn']").click();
			  driver.findElementByXPath("//*[@resource-id='com.net.pvr:id/NonPvr_knowmore']").click();
			  
			  driver.findElementByXPath("//*[@resource-id='com.net.pvr:id/offerImg']").click();
			
			driver.quit();
			
	}
	}


