package com.camascope.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.camascope.base.BaseClass;
import com.camascope.pageobjects.HomePage;
import com.camascope.pageobjects.WelcomePage;

public class HomePageTest extends BaseClass{

	HomePage homePage;
	WelcomePage welcomePage;

	@BeforeMethod
	public void setup() {
		launchApp();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void verifyClickFishMenuBtnTest() {
		homePage = new HomePage();
		boolean fishBtn = homePage.validateFishMenuBtn();
		Assert.assertTrue(fishBtn);
	}

	@Test
	public void verifyClickDogMenuBtnTest() {
		homePage = new HomePage();
		boolean dogBtn = homePage.validateDogMenuBtn();
		Assert.assertTrue(dogBtn);
	}

	@Test
	public void verifyHomePageTest() {
		welcomePage = new WelcomePage();
		homePage = welcomePage.clickOnEnterTheStore();
	}

}
