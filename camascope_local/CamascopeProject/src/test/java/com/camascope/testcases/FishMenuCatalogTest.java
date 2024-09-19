package com.camascope.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.camascope.base.BaseClass;
import com.camascope.pageobjects.FishMenuCatalogPage;
import com.camascope.pageobjects.HomePage;
import com.camascope.pageobjects.LoginPage;
import com.camascope.pageobjects.WelcomePage;

public class FishMenuCatalogTest extends BaseClass{

	WelcomePage welcomePage;
	HomePage homePage;
	LoginPage loginPage;
	FishMenuCatalogPage fishMenuCatalogPage;

	@BeforeMethod
	public void setup() {
		launchApp();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void verifyFishMenuCatalogTest() {
		welcomePage = new WelcomePage();
		homePage = welcomePage.clickOnEnterTheStore();
		fishMenuCatalogPage = homePage.clickOnFishCategory();
	}

	@Test
	public void verifyFishMenuCatalogHeaderTest() {
		fishMenuCatalogPage = new FishMenuCatalogPage();
		boolean headerPresent = fishMenuCatalogPage.validateHeader();
		Assert.assertTrue(headerPresent);
	}

}
