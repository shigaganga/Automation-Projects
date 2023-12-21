package com.automation.tests.utility;



import java.sql.Date;
import java.text.SimpleDateFormat;

import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.automation.tests.base.BaseTest;

public class TestEventListenersUtility extends BaseTest implements ITestListener{
	private static ExtentReportUtility extentUtilityObject;

	@Override
	public void onTestStart(ITestResult result) { // before every @Test method called this method is executed
		extentUtilityObject.startSingleTestReport(result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		extentUtilityObject.logTestpassed(result.getMethod().getMethodName()+" is passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		extentUtilityObject.logTestFailed(result.getMethod().getMethodName()+" is failed");
		String filename=new SimpleDateFormat("yyyy_MM_DD_HH_mm-ss").format(new Date(0));
		System.out.println("filename="+filename);
		String path=Constants.SCREENSHOTS_DIRECTORY_PATH+filename+".png";
	takesScreenshot(path);
	extentUtilityObject.logTestWithscreenshot("./screenshots"+filename+".png");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		extentUtilityObject=ExtentReportUtility.getInstance();
		System.out.println("report utility object created="+extentUtilityObject.toString());
		extentUtilityObject.startExtentReport();
	}

	@Override
	public void onFinish(ITestContext context) {
		extentUtilityObject.endReport();
	}
	
}
