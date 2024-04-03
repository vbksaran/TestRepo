package com.CRM.MyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Config.Utility;

public class LoginPage {
	
	private WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
			}

	private By uname=By.id("email-id");
	private By pass=By.id("password");
	private By loginbtn=By.id("submit-id");
	
	
	public void doLogin(String un, String ps) {
		driver.findElement(uname).sendKeys(un);
		driver.findElement(pass).sendKeys(ps);
		driver.findElement(loginbtn).click();
		Utility.capture(driver);
	}
}
