package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Validations {
  @Test
  public void f() {
	  
	     WebDriver d=new FirefoxDriver();
		d.navigate().to("http://opensource.demo.orangehrmlive.com/");
		d.manage().window().maximize();
		
		String exp = "OrangeHRM12345";
		
		String act= d.getTitle();
		System.out.println("The Actuall Title is==="+act);
		
		Assert.assertEquals(act, exp);
		
		System.out.println("Test case done");
		 
  }
}



