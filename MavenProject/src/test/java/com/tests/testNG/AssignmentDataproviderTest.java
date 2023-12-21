package com.tests.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AssignmentDataproviderTest {
  @Test(dataProvider = "loginData",dataProviderClass = AssignmentDataproviderXlsx.class)
  public void loginTest(String username,String password) throws InterruptedException{
	  
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().window().maximize();
		driver.get("https://qa-tekarch.firebaseapp.com/");
	driver.findElement(By.id("email_field")).sendKeys(username);
	Thread.sleep(2000);
	driver.findElement(By.id("password_field")).sendKeys(password);	
	driver.findElement(By.tagName("button")).click();
	Thread.sleep(5000);
	driver.quit();
		
  }
}

