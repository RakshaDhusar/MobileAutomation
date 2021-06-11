package com.cyient.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class WebAppTest {

	public static  void main(String[] args) throws MalformedURLException{
		
		DesiredCapabilities cap=new DesiredCapabilities();
	       
        cap.setCapability("platformName", "Android");
        cap.setCapability("deviceName", "redmi");
        cap.setCapability("browserName", "chrome");
        
      //send DesiredCapabilities details to the appium server
        AndroidDriver<WebElement>  driver=new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
	
      //send DesiredCapabilities details to the appium server
      		AndroidDriver<WebElement>  driver=new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
      		
      		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
      		driver.get("https://magento.com/");
      		
      		//driver.findElement(By.xpath("//span[text()='Sign in']")).click();
      		
      		driver.findElementByXPath("//span[text()='Sign in']").click();
      		
      		//enter username as balaji0017@gmail.com
      		driver.findElementByXPath("//input[@id='email']").sendKeys("balaji0017@gmail.com");
      		//enter password as balaji@12345
      		driver.findElementByXPath("//input[@id='pass']").sendKeys("balaji@12345");
      		//click continue 
      		driver.findElementByXPath("//*[@id='send2']").click();
      		
      		//wait until logout presence //explicit wait
      		WebDriverWait wait=new WebDriverWait(driver, 50);
      		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Log Out']")));
      		
      		//get the title and print
      		String actualTitle=driver.getTitle();
      		System.out.println(actualTitle);

      		
      		driver.findElementByXPath("//a[text()='Log Out']").click();
      		
      		driver.quit();
      	
	
	}
	
	
}