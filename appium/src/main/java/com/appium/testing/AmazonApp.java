package com.appium.testing;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class AmazonApp {
	
	static AndroidDriver driver;
	
	public static void main(String[] args) throws MalformedURLException {
		File app=new File("C:\\Users\\shiga\\java-workspace\\MobileTesting\\Downloads\\amazon-shopping-26-21-0-100.apk");

		DesiredCapabilities dc=new DesiredCapabilities();
	//	dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, null);
	//	dc.setCapability(MobileCapabilityType.DEVICE_NAME, null);
		
		// devices information
		dc.setCapability("deviceName","96MX227QL");
		dc.setCapability("platformName","Android");
		dc.setCapability("platformVersion","12");
		
		dc.setCapability("app",app.getAbsolutePath());       // apk file path defined in line 18
		// app settings
		dc.setCapability("appPackage","com.amazon.mShop.android.shopping");
		dc.setCapability("appActivity","com.amazon.mShop.navigation.MainActivity ");
		
    	dc.setCapability("noReset", true);     // don't wants to reset the app (don't want to loose the app data)
		
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
	}
}
