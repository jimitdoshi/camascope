package com.camascope.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.camascope.base.BaseClass;
import com.camascope.pageobjects.HomePage;
import com.camascope.pageobjects.LoginPage;
import com.camascope.pageobjects.WelcomePage;

public class LogInTest extends BaseClass{

	WelcomePage welcomePage;
	HomePage homePage;
	LoginPage loginPage;

	@BeforeMethod
	public void setup() {
		launchApp();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void verifyLoginTest() {
		welcomePage = new WelcomePage();
		homePage = welcomePage.clickOnEnterTheStore();
		loginPage = homePage.clickOnSignInBtn();
	}

}
