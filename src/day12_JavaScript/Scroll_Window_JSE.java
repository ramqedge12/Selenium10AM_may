package day12_JavaScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Scroll_Window_JSE {
  @Test
  public void f() {
	  
	  WebDriver d=new FirefoxDriver();
		d.navigate().to("http://www.hdfcbank.com/");
		d.manage().window().maximize();
		
		JavascriptExecutor obj=(JavascriptExecutor)d;
		obj.executeScript("window.scrollBy(0,700)");
  }
}









