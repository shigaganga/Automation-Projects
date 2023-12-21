package com.automation.pages.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class BasePage {
protected WebDriver driver;
WebDriverWait wait;
public BasePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public String GetPageTitle() {
	return driver.getTitle();
}
public void refreshPage() {
	driver.navigate().refresh();
}
public String getTextFromElement(WebElement ele,String objectName) {
	String data=ele.getText();
	return data;
}
public static void closeBrowser() {
	try {
		driver.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
driver=null;
}
public static void quitBrowser() {
	driver.quit();
	driver=null;
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

public static void waitForVisibility(WebElement ele,int time,String objectName) {
	wait=new WebDriverWait(driver,Duration.ofSeconds(time));
	wait.until(ExpectedConditions.visibilityOf(ele));
}
public static void waitUntilPresenceOfElementLocatedBy(By locator,String objectName) {
	System.out.println("waiting for an element"+objectName+"for its visibility");
	wait= new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
}

public static void waitUntilElementToBeClickable(By locator,String objectName) {
	System.out.println("waiting for an element"+objectName+"to be clickable");
	wait= new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(locator));
}

public static void waitforAlertPresent(int time) {

WebDriverWait	wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	wait.until(ExpectedConditions.alertIsPresent());
}
public static void switchToWindowOpened(String mainWindowHandle) {
	Set<String>allWindowHandles=driver.getWindowHandles();
	for(String handle:allWindowHandles) {
		if(!mainWindowHandle.equalsIgnoreCase(handle))
			driver.switchTo().window(handle);
		
	}
	System.out.println("Switched to new window ");
}
public static WebElement   selectFromListUsingText(List<WebElement>list,String text) {
	WebElement element=null;
	for(WebElement i:list) {
		if(i.getText().equalsIgnoreCase(text)){
	System.out.println("Selected="+i.getText());
	element=i;
	break;
}}return element;}
//***selectclass reusable methods**************//

public static void selectByTextData(WebElement element, String text,String objName)
{
	Select selectText=new Select(element);
	selectText.selectByVisibleText(text);
	System.out.println(objName+"selected"+text);
}
public static void selectByIndexData(WebElement element, int index,String objName)
{
	waitForVisibility(element, 5, objName);
	Select selectIndex=new Select(element);
	selectIndex.selectByIndex(index);
	System.out.println(objName+"selected"+index);
}
public static void selectByValueData(WebElement element, String text,String objName)
{
	Select selectValue=new Select(element);
	selectValue.selectByVisibleText(text);
	System.out.println(objName+"selected"+text);
}
//***Action class reusable methods***//
public static void waitUntilPageLoads() {
	System.out.println("waiting until page loads until 30seconds maximum");
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
}
public static void MoveToElementAction(WebElement ele,String objName) {
	Actions action=new Actions(driver);
	action.moveToElement(ele).build().perform();
	System.out.println("cursor moved to the webelement"+objName);
}
public static void ContextClickAction(WebElement ele,String objName) {
	Actions action=new Actions(driver);
	action.contextClick(ele).build().perform();
	System.out.println("right click performed to the webelement"+objName);
}
}









