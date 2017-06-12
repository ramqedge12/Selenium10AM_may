package com.ProjName.ReuseFun;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ProjName.Utilities.ScreenShot;

public class ReUse_Hybid 
{
	
	public WebDriver dr;
	public  String proppath;
	public String expres;
	public String actres;
	
	
	 FileInputStream fis;
	 Properties pr;
	
	public String launchApp(String url) throws IOException
	{
		String expres="OrangeHRM123";
		
		 dr = new FirefoxDriver();
		  dr.navigate().to(url);
		  dr.manage().window().maximize();
		  
		  String actres= dr.getTitle();
		  
		  if(expres.equals(actres))
		  {
			  return "PASS";
		  }
		  else
		  {
			ScreenShot.screens(dr, "launchS");
			
			return "Fail";
		  }  
	}
	
	
	public String loginApp(String username, String password) throws IOException
	{
		  proppath="E:\\workspace10am_may\\SeleniumProj\\src\\com\\ProjName\\Properties\\prop.properties";
		
		   fis=new FileInputStream(proppath);
		   pr=new Properties();
		  pr.load(fis);
		
		  expres="Welcome Admitrrrn";
		  
		  dr.findElement(By.id(pr.getProperty("un"))).sendKeys(username);
		  dr.findElement(By.id(pr.getProperty("psd"))).sendKeys(password);
		  dr.findElement(By.id(pr.getProperty("logbtn"))).click();
		  
		actres=  dr.findElement(By.xpath(pr.getProperty("welcomeLink")))
				                       .getText();
		  
		if(expres.equals(actres))
		{
			return "Login Pass";
		}
		else
		{
			ScreenShot.screens(dr, "LoginS");
			
			return "Login Fail";
		}
	
	}

}
