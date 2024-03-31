package com.CRM.TestCases;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.CRM.MyPages.*;

public class BaseClass {
	public WebDriver driver;
	public HomePage hp;
	public LoginPage lp;
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationplayground.com/crm/");
		hp=new HomePage(driver);
		lp=new LoginPage(driver);
		
		}
	@BeforeClass
	public void pageSetup() {
		
		hp.getSignIn();
		
				
	}
	
}
