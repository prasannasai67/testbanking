package com.testbanking.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testbanking.PageObjects.CustomerLogin;

public class TC_CustomerLogin_003 extends Baseclass{
	
	@Test
	public void CustomerLogin() {
		CustomerLogin custlg = new CustomerLogin(driver);
		custlg.CustomerLogin();
		
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Protractor practice website - Banking App");
	
	
	
	
	
	


	}
	}
