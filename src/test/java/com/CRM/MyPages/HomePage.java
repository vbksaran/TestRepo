package com.CRM.MyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver=driver;
	}
	
	private By sgnIn=By.id("SignIn");
	
	public String getAppURL() {
		return driver.getCurrentUrl();		
	}
	public String getTitle() {
		return driver.getTitle();		
	}
	public void getSignIn() {
		driver.findElement(sgnIn).click();;
	}
}
