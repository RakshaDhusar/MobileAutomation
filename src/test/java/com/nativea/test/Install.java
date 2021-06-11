package com.nativea.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Install {
	
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cap=new DesiredCapabilities();
	       
        
        cap.setCapability("deviceName", "redmi");
        cap.setCapability("platformName", "Android");
        
        cap.setCapability("app", "C:\\Components\\app\\Khan Academy_v6.3.0_apkpure.com.apk");
        
      //send DesiredCapabilities details to the appium server
        AndroidDriver<WebElement>  driver=new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
        
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        
        driver.findElementByXpath("//*[@text='Dismiss']").click();
        driver.findElementByXpath("//*[@text='Profile']").click();
        driver.findElementByXpath("//*[@text='Sign in']").click();
        driver.findElementByXpath("//*[@text='Enter an e-mail address or username']").sendkeys("RD@gmail.com");
        driver.findElementByXpath("//*[contains(@text,Pass')]").click();
        driver.findElementByXpath("//*[@text='Sign in'][2]").click();
        String actualValue=driver.findElementByXpath("//*[contains(@text,'Invalid']").getText();
        System.out.println(actualValue);
	
		
	}

}
