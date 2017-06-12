package com.ProjName.ReuseFun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class POM_Objects {
	
	@FindBy(id="txtUsername") 
	@CacheLookup
	WebElement un;
	
	@FindBy(id="txtPassword")
	@CacheLookup
	WebElement psd;
	
	@FindBy(id="btnLogin")
	@CacheLookup
	WebElement login;
	
	public void loginApp(String user, String passwd)
	{
		un.sendKeys(user);
		psd.sendKeys(passwd);
		login.click();
	}
	
	
}





