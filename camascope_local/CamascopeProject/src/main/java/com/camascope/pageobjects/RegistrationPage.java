package com.camascope.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.camascope.actiondriver.Action;
import com.camascope.base.BaseClass;

public class RegistrationPage extends BaseClass{

	@FindBy(xpath="//input[@value='Save Account Information']")
	WebElement saveAccountInfoBtn;

	@FindBy(xpath="//h3[contains(text(),'User Information')]")
	WebElement userInfoHeaderText;

	@FindBy(xpath="//td[contains(text(),'User ID:')]//following::input[1]")
	WebElement userIdInputEditField;

	@FindBy(xpath="//td[contains(text(),'New password:')]//following::input[1]")
	WebElement newPasswordInputEditField;

	@FindBy(xpath="//td[contains(text(),'Repeat password:')]//following::input[1]")
	WebElement repeatPasswordInputEditField;

	@FindBy(xpath="//td[contains(text(),'First name:')]//following::input[1]")
	WebElement firstNameInputEditField;

	@FindBy(xpath="//td[contains(text(),'Last name:')]//following::input[1]")
	WebElement lastNameInputEditField;

	@FindBy(xpath="//td[contains(text(),'Email:')]//following::input[1]")
	WebElement emailInputEditField;

	@FindBy(xpath="//td[contains(text(),'Phone:')]//following::input[1]")
	WebElement phoneInputEditField;

	@FindBy(xpath="//td[contains(text(),'Address 1:')]//following::input[1]")
	WebElement addressInputEditField;

	@FindBy(xpath="//td[contains(text(),'City')]//following::input[1]")
	WebElement cityInputEditField;

	@FindBy(xpath="//td[contains(text(),'State:')]//following::input[1]")
	WebElement stateInputEditField;

	@FindBy(xpath="//td[contains(text(),'Zip:')]//following::input[1]")
	WebElement zipInputEditField;

	@FindBy(xpath="//td[contains(text(),'Country:')]//following::input[1]")
	WebElement countryInputEditField;


	public RegistrationPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public HomePage clickOnSaveAccountInfoBtn() {
		Action.click(getDriver(), saveAccountInfoBtn);
		return new HomePage();
	}

	public void enterUserIdInputEditField(String userID) {
		Action.type(userIdInputEditField, userID);
	}

	public void enterNewPasswordInputEditField(String newPassword) {
		Action.type(newPasswordInputEditField, newPassword);
	}

	public void enterRepeatPasswordInputEditField(String repeatPassword) {
		Action.type(repeatPasswordInputEditField, repeatPassword);
	}

	public void enterFirstNameInputEditField(String firstName) {
		Action.type(firstNameInputEditField, firstName);
	}

	public void enterLastNameInputEditField(String lastName) {
		Action.type(lastNameInputEditField, lastName);
	}

	public void enterEmailInputEditField(String email) {
		Action.type(emailInputEditField, email);
	}

	public void enterPhoneInputEditField(String phone) {
		Action.type(phoneInputEditField, phone);
	}

	public void enterAddressInputEditField(String address) {
		Action.type(addressInputEditField, address);
	}

	public void enterCityInputEditField(String city) {
		Action.type(cityInputEditField, city);
	}

	public void enterStateInputEditField(String state) {
		Action.type(stateInputEditField, state);
	}

	public void enterZipInputEditField(String zip) {
		Action.type(zipInputEditField, zip);
	}

	public void enterCountryInputEditField(String country) {
		Action.type(countryInputEditField, country);
	}

	public boolean validateHeader() {
		return Action.isDisplayed(getDriver(), userInfoHeaderText);
	}

}
