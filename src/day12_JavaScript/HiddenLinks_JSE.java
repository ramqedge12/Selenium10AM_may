package day12_JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class HiddenLinks_JSE {
  @Test
  public void f() {
	  
	  WebDriver d=new FirefoxDriver();
		d.navigate().to("http://www.bing.com/");
		d.manage().window().maximize();
		
		// identify Hidden Element
		WebElement src =d.findElement(By.id("officemenu_excel_img"));
		WebElement src12 =d.findElement(By.id("officemenu_onenote_img"));
		
		Sleeper.sleepTightInSeconds(3);

		
		JavascriptExecutor obj=(JavascriptExecutor)d;
		
		obj.executeScript("arguments[0].click()", src);
		
		Sleeper.sleepTightInSeconds(3);
		
		obj.executeScript("arguments[0].click()", src12);
		 
  }
}



