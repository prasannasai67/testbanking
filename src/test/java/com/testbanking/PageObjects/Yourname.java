package com.testbanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Yourname {
	WebDriver ldriver;

	public Yourname(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
}
	@FindBy(xpath="//*[@id=\"userSelect\"]")
	@CacheLookup
	WebElement Yourname;
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/form/button")
	@CacheLookup
	WebElement login;

	public void yourname() {
		Select select =new Select(Yourname);
		 select.selectByIndex(5);
	}
	public void login() {
		login.click();
		
	}
}


