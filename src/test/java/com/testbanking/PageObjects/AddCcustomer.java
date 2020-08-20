package com.testbanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCcustomer {
	WebDriver ldriver;

	public AddCcustomer(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
}

	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[1]/button[1]")
	@CacheLookup
	WebElement Addcustomer;
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/div[1]/input")
	@CacheLookup
	WebElement Firstname;
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/div[2]/input")
	@CacheLookup
	WebElement Lastname;
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/div[3]/input")
	@CacheLookup
	WebElement Pincode;
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/button")
	@CacheLookup
	WebElement AddcustomerButton;
	
	public void AddCustomerLink() {
		Addcustomer.click();
	}
	public void FirstName(String fname) {
		Firstname.sendKeys(fname);
	}
	public void Lastname(String Lname) {
		Lastname.sendKeys(Lname);
	}
	public void Pincode(String pin) {
		Pincode.sendKeys(pin);
	}
	public void AddCustomerButton() {
		AddcustomerButton.click();
	}
	


	
}
