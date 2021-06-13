package com.cyient.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class KhanAcdeny {
	
	 public static void main(String[] args) throws MalformedURLException, InterruptedException {
		    
	      DesiredCapabilities caps = new DesiredCapabilities();
	      
	      // Set your access credentials
	      caps.setCapability("browserstack.user", "rakshadhusar_wNhV23");
	      caps.setCapability("browserstack.key", "2dDD8n71yWNzYS86otkU");
	      
	      // Set URL of the application under test
	      caps.setCapability("app", "bs://8d062ca2e60ca74ffd82508568656e99b37dca73");
	      
	      // Specify device and os_version for testing
	      caps.setCapability("device", "Google Pixel 3");
	      caps.setCapability("os_version", "9.0");
	        
	      // Set other BrowserStack capabilities
	      caps.setCapability("project", "First Java Project");
	      caps.setCapability("build", "Java Android");
	      caps.setCapability("name", "first_test");
	        
	      
	      // Initialise the remote Webdriver using BrowserStack remote URL
	      // and desired capabilities defined above
	      AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://hub.browserstack.com/wd/hub"),
					caps);
	        /* Write your Custom code here */

			// Invoke driver.quit() after the test is done to indicate that the test is
			// completed.
		//	driver.quit();
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

//			driver.findElementByXPath("//android.widget.TextView[@text='Dismiss']").click(); //click on dismiss

			driver.findElementByXPath("//*[@text='Dismiss']").click();

			driver.findElementByXPath("//*[@text='Profile']").click();

			driver.findElementByXPath("//*[@text='Sign in']").click();

			driver.findElementByXPath("//*[@text='Enter an e-mail address or username']").sendKeys("hello@gmail.com");

			driver.findElementByXPath("//*[contains(@text,'Pass')]").sendKeys("hello123");

			driver.findElementByXPath("(//*[@text='Sign in'])[2]").click();

			String actualValue = driver.findElementByXPath("//*[contains(@text,'Invalid')]").getText();
			System.out.println(actualValue);

			driver.quit();

		}

	}
	        
	        
	        
	        
	        
	 }

}
