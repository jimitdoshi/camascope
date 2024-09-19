package com.camascope.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.camascope.actiondriver.Action;
import com.camascope.base.BaseClass;

public class LoginPage extends BaseClass{

	@FindBy(xpath="//input[@value='Login']")
	WebElement loginBtn;

	@FindBy(xpath="//a[text()='Register Now!']")
	WebElement registerNowBtn;

	@FindBy(xpath="//input[@name='username']")
	WebElement userIdInputEditField;

	@FindBy(xpath="//input[@name='password']")
	WebElement passwordInputEditField;

	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public HomePage clickOnLoginBtnBtn() {
		Action.click(getDriver(), loginBtn);
		return new HomePage();
	}

	public void enterUserIdInputEditField(String userID) {
		Action.type(userIdInputEditField, userID);
	}

	public void enterPasswordInputEditField(String password) {
		Action.type(passwordInputEditField, password);
	}

	public HomePage login(String username, String password) {
		Action.type(userIdInputEditField, username);
		Action.type(passwordInputEditField, password);
		return clickOnLoginBtnBtn();
	}

	public RegistrationPage clickOnRegistrationBtn() {
		Action.click(getDriver(), loginBtn);
		return new RegistrationPage();
	}


}