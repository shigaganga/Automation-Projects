package com.automation.pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.pages.base.BasePage;

public class LoginPage extends BasePage {
	@FindBy(id="email_field") WebElement userNameElement;
	
	@FindBy(id="password_field") WebElement passwordElement;
	@FindBy(tagName="button") WebElement loginButtonElement;
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	public void enterUserName(String data){
		enterText(userNameElement,data,"username textbox");
		
	}
	public void enterPassword(String data){
		enterText(passwordElement,data,"passwordField");
		
	}
	public void clickButton(){
		clickElement(loginButtonElement,"button textbox");
		
	}
	public String getTitleOfThePage(){
		return GetPageTitle();
		
	}
}
