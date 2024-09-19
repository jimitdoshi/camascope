package com.camascope.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.camascope.base.BaseClass;
import com.camascope.pageobjects.WelcomePage;

public class WelcomePageTest extends BaseClass{

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
	public void verifyHeaderTest() {
		welcomePage = new WelcomePage();
		boolean headerPresent = welcomePage.validateHeader();
		Assert.assertTrue(headerPresent);
		String title = welcomePage.getTitle();
		System.out.println(title);
	}

	@Test
	public void verifyTitleTest() {
		welcomePage = new WelcomePage();
		String title = welcomePage.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "JPetStore Demo");
	}

}