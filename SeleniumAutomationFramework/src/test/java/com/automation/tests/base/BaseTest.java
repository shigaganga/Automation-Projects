package com.automation.tests.base;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.automation.tests.utility.ExtentReportUtility;
import com.automation.tests.utility.Log4jUtility;
import com.automation.tests.utility.PropertiesUtility;
import com.google.common.io.Files;



public class BaseTest {
	protected static WebDriver driver=null;
	static WebDriverWait wait=null;
	protected Log4jUtility logObject=Log4jUtility.getInstance();
	static protected Logger myLog;
	protected ExtentReportUtility report=ExtentReportUtility.getInstance(); {
		
	}
	@BeforeTest
	public void setupBeforeTest() {
		myLog=logObject.getLogger();
		
	}
	
	
	@BeforeMethod
	@Parameters("browsername")
	public static void setUpBeforeTestMethod(@Optional("firefox") String browser_name) {
		PropertiesUtility pro1=new PropertiesUtility();
		Properties p=pro1.createPropertyObject();
		pro1.loadFile("applicationDataProperties",p);
		String url=pro1.getPropertyValue("url");
		launchBrowser(browser_name);
		maximiseBrowser();
		goToUrl(url);
	}
	@AfterMethod
	public void tearDownAfterTestMethod() {
		closeBrowser();
		System.out.println("******login_to_firebase automation script ended***********");
	}
	
	public static void launchBrowser(String browserName) {
		switch(browserName) {
		case "firefox":driver=new FirefoxDriver();
						System.out.println("firefox browser launched");
						break;
		case "chrome":driver=new ChromeDriver();
						System.out.println("chrome browser launched");
						break;
		default: System.out.println("you have not entrered the correct browser");
		
			
		}
	}
	
	public static void goToUrl(String url) {
		driver.get(url);
		System.out.println(url+ "is entered");
	}
	
	public static void maximiseBrowser() {
		driver.manage().window().maximize();
		System.out.println("browser window has maximized");
	}
	public static String getPageTitle() {
		return driver.getTitle();
	}

	public static void refreshPage() {
		driver.navigate().refresh();

	}
	
	public static String getTextFromElement(WebElement ele,String objectName) {
		String data=ele.getText();
		System.out.println("extracted the text from"+objectName);
		return data;
	}
	
	public static void closeBrowser() {
		driver.close();
		System.out.println("browser closed");
		System.out.println("******invalid_login_to_firebase1 automation script ended***********");
	}
	public static void quitBrowser() {
		driver.quit();
	}
	
	public static void enterText(WebElement ele,String data,String ObjectName) {
		if (ele.isDisplayed()) {
			clearElement(ele, ObjectName);
			ele.sendKeys(data);
			System.out.println("data is entered in the "+ObjectName);
		} else {
			System.out.println(ObjectName+" element is not displayed");
		}
	}
	public static void clearElement(WebElement ele,String ObjectName) {
		if (ele.isDisplayed()) {
			ele.clear();
			System.out.println(ObjectName+" is cleared");
		}
		else {
			System.out.println(ObjectName+" element is not displayed");
		}
	}
	
	public static void clickElement(WebElement ele,String ObjectName) {
		if(ele.isEnabled()) {
			ele.click();
			System.out.println(ObjectName+"button is clicked");
			}
			else {
				System.out.println("button element is not enabled");
			}
	
	}
	public static void  takesScreenshot(WebElement element,String filepath)throws IOException
	{
 File src=element.getScreenshotAs(OutputType.FILE);
 File destination=new File(filepath);
 Files.copy(src,destination);
	}
	
}
	

