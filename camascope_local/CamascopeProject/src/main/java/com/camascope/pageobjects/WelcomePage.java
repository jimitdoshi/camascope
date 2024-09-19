package com.camascope.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.camascope.actiondriver.Action;
import com.camascope.base.BaseClass;

public class WelcomePage extends BaseClass{

	@FindBy(xpath = "//a[contains(text(),'Enter the Store')]")
	WebElement enterTheStoreBtn;

	@FindBy(xpath = "//h2[contains(text(),'Welcome to JPetStore')]")
	WebElement headingTextField;

	public WelcomePage() {
		PageFactory.initElements(getDriver(), this);
	}

	public HomePage clickOnEnterTheStore() {
		Action.click(getDriver(), enterTheStoreBtn);
		return new HomePage();
	}

	public boolean validateHeader() {
		return Action.isDisplayed(getDriver(), headingTextField);
	}

	public String getTitle() {
		return getDriver().getTitle();
	}
}