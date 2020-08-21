package com.testbanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerLogin {
	WebDriver ldriver;

	public CustomerLogin(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
}
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[1]/div[1]/button")
	@CacheLookup
	WebElement CustomerLogin;
	
	public void CustomerLogin() {
		CustomerLogin.click();
		
	}


}
