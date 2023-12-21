package com.appium.testing;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class CalcApp {
	
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
		
		MobileElement button_2=driver.findElement(By.id("com.google.android.calculator:id/digit_2"));
		//button_2.click();
		MobileElement plus=driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"plus\"]"));
		plus.click();
		MobileElement button_5=driver.findElement(By.id("com.google.android.calculator:id/digit_5"));
		//button_5.click();
		MobileElement equal=driver.findElementByAccessibilityId("equals");
		TouchAction action=new AndroidTouchAction(driver);
		//touch action using element
		/*action.tap(TapOptions.tapOptions().withElement(ElementOption.element(button_2))).perform();
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(plus))).perform();
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(button_5))).perform();
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(equal))).perform();
		*/
		//touchaction using coordinates
		action.tap(PointOption.point(null)).perform();
		
		Thread.sleep(1000);
		driver.quit();
	}

}
