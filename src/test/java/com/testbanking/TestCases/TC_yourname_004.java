package com.testbanking.TestCases;



import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.testbanking.PageObjects.CustomerLogin;
import com.testbanking.PageObjects.Yourname;

public class TC_yourname_004  extends Baseclass{
	
	@Test
	public void yourname() throws InterruptedException {
		CustomerLogin custlg = new CustomerLogin(driver);
		custlg.CustomerLogin();
		logger.info("login");
	   Thread.sleep(6000);
		
		Yourname yourname = new Yourname(driver);
		yourname.yourname();
		logger.info("select name");
		yourname.login();
		logger.info("login inside");
		
		Thread.sleep(8000);
		boolean res = driver.getPageSource().contains("Welcome Neville Longbottom !!");
		
		if (res == true) {
			Assert.assertTrue(false);
			
		
		}
		else{
			Assert.assertTrue(true);
		}
		
		
		
	}
	

}
