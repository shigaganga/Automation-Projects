package com.automation.tests.utilities;



	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.MediaEntityBuilder;
	import com.aventstack.extentreports.Status;
	import com.aventstack.extentreports.markuputils.ExtentColor;
	import com.aventstack.extentreports.markuputils.MarkupHelper;
	import com.aventstack.extentreports.reporter.ExtentSparkReporter;
	import com.aventstack.extentreports.reporter.configuration.Theme;

	public class ExtentReportUtility {
		public static ExtentReports report ;
		public static ExtentSparkReporter spark;
		public static ExtentTest testLogger;
		private static ExtentReportUtility extentObject;
		
		private ExtentReportUtility() {
			
		}
		
		public static ExtentReportUtility getInstance() {
			if(extentObject==null) {
				extentObject=new ExtentReportUtility();
			}

			return extentObject;
		}
		
		public void startExtentReport() {
			report= new ExtentReports();
			spark = new ExtentSparkReporter(Constants.SPARKS_HTML_REPORT_PATH);
			report.setSystemInfo("Host Name", "Salesforce");
			report.setSystemInfo("Environment", "QA");
			report.setSystemInfo("User Name", "Divyashree");
			
			spark.config().setDocumentTitle("Test Execution Report");
			spark.config().setReportName("firebase regression tests");
			spark.config().setTheme(Theme.DARK);
			report.attachReporter(spark);	
		}
		
		public void startSingleTestReport(String methodName) {
			testLogger=report.createTest(methodName);
		}
		public void endReport() {
			report.flush();
		}
		
		public void logTestInfo(String text) {
			testLogger.log(Status.INFO,text);
			//testLogger.info(text);
		}
		
		public void logTestpassed(String text) {
			testLogger.log(Status.PASS,MarkupHelper.createLabel(text, ExtentColor.GREEN));
		}
		
		public void logTestFailed(String text) {
			testLogger.log(Status.FAIL,MarkupHelper.createLabel(text, ExtentColor.RED));
		}
		
		public void logTestFailedWithException(Throwable e) {
			testLogger.log(Status.FAIL,e);
		
			}
		
		public void logTestWithscreenshot(String path) {
			//testLogger.addScreenCaptureFromBase64String(path);
			testLogger.fail(MediaEntityBuilder.createScreenCaptureFromPath(path).build());
			
		}

		
		
		

	}
