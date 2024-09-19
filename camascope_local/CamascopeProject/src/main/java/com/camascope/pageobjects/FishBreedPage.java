package com.camascope.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.camascope.actiondriver.Action;
import com.camascope.base.BaseClass;

public class FishBreedPage extends BaseClass{

	@FindBy(xpath="//h2[contains(text(),'Angelfish')]")
	WebElement fishProductHeaderText;

	@FindBy(xpath="//a[contains(text(),'FI-SW-01')]")
	WebElement fishProduct1Btn;

	@FindBy(xpath="(//a[contains(text(),'Add to Cart')])[1]")
	WebElement addToCartBtn;

	public FishBreedPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public OrderSummaryPage clickOnAddToCart() {
		Action.click(getDriver(), addToCartBtn);
		return new OrderSummaryPage();
	}

	public boolean validateHeader() {
		return Action.isDisplayed(getDriver(), fishProductHeaderText);
	}

}
