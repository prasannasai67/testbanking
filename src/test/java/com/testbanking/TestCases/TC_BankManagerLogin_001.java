package com.testbanking.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testbanking.PageObjects.BankmanagerLogin;

public class TC_BankManagerLogin_001 extends Baseclass{
	
	@Test
	public void BnakManagerLogin() {
	
			
		BankmanagerLogin bml=new BankmanagerLogin(driver);
		bml.BnakManagerLoginButton();
		
		String pagetitle=driver.getTitle();
		System.out.println(pagetitle);
		Assert.assertEquals(pagetitle, "Protractor practice website - Banking App");
	}

}
