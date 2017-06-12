package day12_JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Gmail_Aseert {

	@Test
	public void f()
	{
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://gmail.com/");
		driver.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(2);
		
		//click Next button
		driver.findElement(By.xpath
				(".//*[@id='identifierNext']/content")).click();
		
		String exp="phone number";
		Sleeper.sleepTightInSeconds(2);
		
		//get text of the UserName Error mesage
		String act= driver.findElement
				    (By.xpath(".//*[@id='view_container']")).getText();
	    System.out.println(act);
		
		//Assert.assertEquals(exp, act);
		
		Assert.assertTrue(act.contains(exp));
		
		System.out.println("hello ");
		
	}
}



