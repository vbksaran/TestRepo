package com.CRM.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {
	@Test(priority = 1)
	public void verifyURL() {
		String curl = hp.getAppURL();
		Assert.assertTrue(curl.contains("crm"), "URL is wrong");
		System.out.println("URL is valid");

	}

	@Test(priority = 2)
	public void verifyTitle() {
		String title = hp.getTitle();
		Assert.assertTrue(title.contains("Service"), "Title not match");
		System.out.println("Title is matching");
	}

	@Test(priority = 3)
	public void verifySignIn() {
		hp.getSignIn();
		Assert.assertTrue(hp.getAppURL().contains("login"), "Login page not opened");
		System.out.println("log in page opened");
	}
}
