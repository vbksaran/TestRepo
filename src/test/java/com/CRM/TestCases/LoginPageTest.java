package com.CRM.TestCases;

import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {
  @Test
  public void verifyLogin() {
	
	  lp.doLogin("test@gmail.com","test123");
	  
  }
}
