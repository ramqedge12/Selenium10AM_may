package day12_JavaScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Alert_JSE {
  @Test
  public void f() {
	  
	  WebDriver d=new FirefoxDriver();
		d.navigate().to("http://www.bing.com/");
		d.manage().window().maximize();
		
		
		JavascriptExecutor obj=(JavascriptExecutor)d;
		obj.executeScript("alert('hellooo   friends')");
		
		Sleeper.sleepTightInSeconds(2);
		
		d.switchTo().alert().accept();
		
  }
}





