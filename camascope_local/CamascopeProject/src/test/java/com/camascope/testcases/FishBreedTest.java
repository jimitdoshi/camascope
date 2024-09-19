package com.camascope.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.camascope.base.BaseClass;
import com.camascope.pageobjects.FishBreedPage;
import com.camascope.pageobjects.FishMenuCatalogPage;
import com.camascope.pageobjects.HomePage;
import com.camascope.pageobjects.LoginPage;
import com.camascope.pageobjects.WelcomePage;

public class FishBreedTest extends BaseClass{

	WelcomePage welcomePage;
	HomePage homePage;
	LoginPage loginPage;
	FishMenuCatalogPage fishMenuCatalogPage;
	FishBreedPage fishBreedPage;

	@BeforeMethod
	public void setup() {
		launchApp();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void verifyFisBreedTest() {
		welcomePage = new WelcomePage();
		homePage = welcomePage.clickOnEnterTheStore();
		fishMenuCatalogPage = homePage.clickOnFishCategory();
		fishBreedPage = fishMenuCatalogPage.clickOnFishCategory();
	}

}
