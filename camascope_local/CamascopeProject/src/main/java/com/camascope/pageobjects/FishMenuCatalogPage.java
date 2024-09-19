package com.camascope.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.camascope.actiondriver.Action;
import com.camascope.base.BaseClass;

public class FishMenuCatalogPage extends BaseClass{

	@FindBy(xpath="//h2[contains(text(),'Fish')]")
	WebElement fishCatalogHeaderText;

	@FindBy(xpath="//a[contains(text(),'FI-SW-01')]")
	WebElement fishProduct1Btn;

	public FishMenuCatalogPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public FishBreedPage clickOnFishCategory() {
		Action.click(getDriver(), fishProduct1Btn);
		return new FishBreedPage();
	}

	public boolean validateHeader() {
		return Action.isDisplayed(getDriver(), fishCatalogHeaderText);
	}

}
