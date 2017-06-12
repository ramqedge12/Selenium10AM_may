package com.ProjName.TestExe_Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ProjName.ReuseFun.POM_Objects;

public class POM_Obj_EXecution {
  @Test
  public void f() 
  {
	  WebDriver driver=new FirefoxDriver();
	  driver.navigate().to("http://opensource.demo.orangehrmlive.com");
	  driver.manage().window().maximize();
		
		POM_Objects obj=PageFactory.initElements
				               (driver, POM_Objects.class);
 
		obj.loginApp("Admin","admin");
		
  }
}







