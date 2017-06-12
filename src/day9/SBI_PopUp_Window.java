package day9;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterMethod;

public class SBI_PopUp_Window {
 
	WebDriver driver;
	@Test
  public void f() 
	{
		// Click SBI Bonanza link
		driver.findElement(By.xpath(".//*[@id='primary_navigation']/li[7]/a")).click();
		
		// get unique ids of the multiple windows
		Set<String> str1=driver.getWindowHandles();
		System.out.println(str1);
		
		Object s[]=str1.toArray(); // s[0]= main window, s[1]= popup window
		
	   String	pop=s[1].toString();
		
	   // switch to PopUp window
		driver.switchTo().window(pop);
		
		Sleeper.sleepTightInSeconds(2);
		
		// search box 
		driver.findElement(By.xpath(".//*[@id='header']/t")).sendKeys("car");
		Sleeper.sleepTightInSeconds(2);
		
		// close popup window
	   driver.close();
	   
	   //switch from popup  to Main window
	   driver.switchTo().window(s[0].toString());
		
	   Sleeper.sleepTightInSeconds(2);
	   // click corporate webdite link
	   driver.findElement(By.xpath(".//*[@id='primary_']")).click();
	  
	}

	@BeforeMethod
  public void beforeMethod() {
		
		driver=new FirefoxDriver();
		driver.get("https://www.onlinesbi.com/");
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(3);
		
		String str=driver.getWindowHandle();
		System.out.println(str);
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }

}



