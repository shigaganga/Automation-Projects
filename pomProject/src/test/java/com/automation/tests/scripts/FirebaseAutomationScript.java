package com.automation.tests.scripts;

import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
// design pattern --- page object model
import com.automation.tests.base.BaseTest;
import com.automation.tests.utilities.PropertiesUtility;

public class FirebaseAutomationScript extends BaseTest {

	@Test
	public void login_to_firebase() throws InterruptedException {
		//log4j: log
		//extent report
		myLog.info("******login_to_firebase automation script started***********");
		String expected="Student Registration Form";
		PropertiesUtility pro=new PropertiesUtility();
		Properties p=pro.createPropertyObject();
		myLog.info("******user name***********");
		pro.loadFile("applicationDataProperties",p);
		String username=pro.getProperty("login.valid.userid",p);
		String password=pro.getProperty("login.valid.password",p);
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(username);
		loginpage.enterPassword(password);
		driver=loginpage.clickLoginButton();
		
	}
	