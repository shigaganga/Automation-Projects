package com.appium.testing;

import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class ContactApp {

	static AndroidDriver<MobileElement> driver;

	public static void main(String[] args) throws Exception {

		DesiredCapabilities dc=new DesiredCapabilities();

		// devices
					dc.setCapability("deviceName","96MX227QL");
					dc.setCapability("platformName","Android");
					dc.setCapability("platformVersion","12");
					
			    	// app
					dc.setCapability("appPackage","com.google.android.calculator");
					dc.setCapability("appActivity","com.android.calculator2.Calculator");
					
			    	dc.setCapability("noReset", true);     // don't wants to reset the app (don't want to loose the app data)
					
					driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
				

					// app
					dc.setCapability("appPackage","com.google.android.calculator");
					dc.setCapability("appActivity","com.android.calculator2.Calculator");
					
			    	dc.setCapability("noReset", true);     // don't wants to reset the app (don't want to loose the app data)
					
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		MobileElement add_newButton = driver.findElement(By.id("com.samsung.android.contacts:id/menu_search"));

		TouchAction action= new AndroidTouchAction(driver);
		//	action.tap(TapOptions.tapOptions().withElement(ElementOption.element(add_newButton))).perform();


		//	MobileElement search_contact = driver.findElement(By.id("com.samsung.android.contacts:id/search_src_text"));

		//	search_contact.sendKeys("Akshay");

		MobileElement contact1 = driver.findElementByAccessibilityId("airtel live (AL)");

		//	action.tap(TapOptions.tapOptions().withElement(ElementOption.element(contact1))).perform();

		// LongPress (on WebElement)
	//	action.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(contact1)))
	//	.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5))).perform();

		/*	
		action.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(contact1)))
		.release().perform();

		 */
		
		MobileElement menu = driver.findElementByAccessibilityId("Open drawer");
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(menu))).perform();
		
		 Thread.sleep(5000);
		 /*
		 * MobileElement outter_layout =
		 * driver.findElement(By.id("com.samsung.android.contacts:id/profile_layout"));
		 * action.tap(TapOptions.tapOptions().withElement(ElementOption.element(
		 * outter_layout))).perform();
		 */
		
		action.longPress(LongPressOptions.longPressOptions().withPosition(PointOption.point(734,434)))
		.moveTo(ElementOption.point(116,434)).release().perform();
		
		
		Thread.sleep(4000);
		// scroll
		Dimension dimension = driver.manage().window().getSize();
		Double screenHeightStart=dimension.getHeight()*0.8;
		int scrollStart=screenHeightStart.intValue();
		
		Double screentHeightEnd = dimension.getHeight()*0.2;
		int scrollEnd=screentHeightEnd.intValue();
		
		int center=(int) (dimension.width*0.5);
		/*
		 * action.press(PointOption.point(center, scrollStart)).waitAction(new
		 * WaitOptions()
		 * .waitOptions(Duration.ofMillis(500))).moveTo(PointOption.point(center,
		 * scrollEnd)).release().perform();
		 * 
		 * MobileElement contact_twitter = driver.findElement(By.xpath(
		 * "//android.widget.TextView[@content-desc=\"twitter\"]"));
		 * contact_twitter.click();
		 */	
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"+
				".instance(0)).scrollIntoView(new UiSelector()"+
				".text(\"twitter\").instance(0))").click();
	}

}


