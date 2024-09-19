package com.camascope.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.camascope.actiondriver.Action;
import com.camascope.base.BaseClass;

public class HomePage extends BaseClass{

	@FindBy(xpath="(//a[@href='/actions/Catalog.action?viewCategory=&categoryId=FISH'])[2]")
	WebElement fishCategoryBtn;

	@FindBy(xpath="(//a[@href='/actions/Catalog.action?viewCategory=&categoryId=DOGS'])[2]")
	WebElement dogCategoryBtn;

	@FindBy(xpath="//a[text()='Sign In']")
	WebElement signInBtn;

	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}

	public FishMenuCatalogPage clickOnFishCategory() {
		Action.click(getDriver(), fishCategoryBtn);
		return new FishMenuCatalogPage();
	}

	public DogMenuCatalogPage clickOnDogCategory() {
		Action.click(getDriver(), dogCategoryBtn);
		return new DogMenuCatalogPage();
	}

	public boolean validateFishMenuBtn() {
		return Action.isEnabled(getDriver(), fishCategoryBtn);
	}

	public boolean validateDogMenuBtn() {
		return Action.isEnabled(getDriver(), dogCategoryBtn);
	}

	public LoginPage clickOnSignInBtn() {
		Action.click(getDriver(), signInBtn);
		return new LoginPage();
	}

}
