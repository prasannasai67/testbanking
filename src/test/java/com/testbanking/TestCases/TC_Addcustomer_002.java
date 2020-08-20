package com.testbanking.TestCases;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.testbanking.PageObjects.AddCcustomer;
import com.testbanking.PageObjects.BankmanagerLogin;

public class TC_Addcustomer_002 extends Baseclass {

	@Test
	public void Addcustomer() {
		BankmanagerLogin bnkmng = new BankmanagerLogin(driver);
		bnkmng.BnakManagerLoginButton();

		AddCcustomer Addcust = new AddCcustomer(driver);
		Addcust.AddCustomerLink();
		Addcust.FirstName(readconfig.FirstName());
		logger.info("firstname entered");
		Addcust.Lastname(readconfig.LastName());
		logger.info("lastname entered");
		Addcust.Pincode(ramdomNum());
		logger.info("pincode entered");
		Addcust.AddCustomerButton();
		logger.info("clicked onadd customer button");

		Alert alert = driver.switchTo().alert(); // switch to alert

		String alertMessage = driver.switchTo().alert().getText(); // capture alert message

		System.out.println(alertMessage); // Print Alert Message
		if (alertMessage.equals(alertMessage)) {

			alert.accept();
			Assert.assertTrue(true);
		}

		else {
			alert.dismiss();
			Assert.assertTrue(false);
		}

	}
}
