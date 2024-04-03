package com.CRM.MyPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Config.Utility;

public class HomePage {
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver=driver;
	}
	
	private By sgnIn=By.linkText("Sign In");
	
	public String getAppURL() {
		return driver.getCurrentUrl();		
	}
	public String getTitle() {
		return driver.getTitle();		
	}
	public void getSignIn() {
		Utility.capture(driver);
		driver.findElement(sgnIn).click();
		Utility.capture(driver);
	}
}
