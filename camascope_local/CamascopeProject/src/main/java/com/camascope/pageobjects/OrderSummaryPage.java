package com.camascope.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.camascope.actiondriver.Action;
import com.camascope.base.BaseClass;

public class OrderSummaryPage extends BaseClass{

	@FindBy(xpath="//h2[contains(text(),'Shopping Cart')]")
	WebElement orderSummaryHeaderText;

	@FindBy(xpath="//td[contains(text(),'Sub Total')]")
	WebElement subTotalText;

	@FindBy(xpath="//a[contains(text(),'Proceed to Checkout')]")
	WebElement proceedToCheckoutBtn;

	public OrderSummaryPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public LoginPage clickOnAddToCart() {
		Action.click(getDriver(), proceedToCheckoutBtn);
		return new LoginPage();
	}

	public boolean validateHeader() {
		return Action.isDisplayed(getDriver(), orderSummaryHeaderText);
	}

	public boolean validateSubTotal() {
		return Action.isDisplayed(getDriver(), subTotalText);
	}

}
