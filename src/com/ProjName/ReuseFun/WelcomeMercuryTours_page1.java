package com.ProjName.ReuseFun ;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomeMercuryTours_page1 {
	
	
	
	@FindBy(linkText="SIGN-ON")
	WebElement signon;
	public void signonTest()
	{
		signon.click();
	}
	
	@FindBy(linkText="REGISTER")
	WebElement register1;
	public void registerTest()
	{
		register1.click();
	}
	
	@FindBy(linkText="SUPPORT")
	WebElement support;
	public void supportTest()
	{
		support.click();
	}
	
	@FindBy(linkText="CONTACT")
	@CacheLookup
	WebElement contact;
	public void contactTest()
	{
		contact.click();
	}

	
	
	@FindBy(name="userName")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="login")
	WebElement signin;
	public void findAFlight(String u,String p)
	{
		username.sendKeys(u);
		password.sendKeys(p);
		signin.click();
	}
	
	
	@FindBy(linkText="your destination")
	WebElement destinations;
	public void destinationsTest()
	{
		destinations.click();
	}
	
	@FindBy(linkText="featured vacation destinations")
	WebElement vacations;
	public void featuredVacations()
	{
		vacations.click();
	}
	
	@FindBy(linkText="Register here")
	WebElement register;
	public void registerHere()
	{
		register.click();
	}
}
