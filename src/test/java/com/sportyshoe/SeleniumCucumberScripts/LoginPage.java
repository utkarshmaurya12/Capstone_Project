package com.sportyshoe.SeleniumCucumberScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath="//input[@id='email']")
	WebElement loginEmail;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement loginpassword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbtn;
	
	@FindBy(linkText="Cart")
	WebElement clickCart;
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void user_login()
	{
		loginEmail.sendKeys("Utkarsh@gmail.com");
		loginpassword.sendKeys("Utkarsh@123");
		loginbtn.click();
	}
	
	
	public void click_cart()
	{
		clickCart.click();
	}
	
}
