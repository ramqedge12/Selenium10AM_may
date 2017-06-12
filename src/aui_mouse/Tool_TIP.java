package aui_mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tool_TIP {
  @Test
  public void f() {
	  
	  WebDriver d=new FirefoxDriver();
		d.navigate().to("http://demoqa.com/tooltip/");
		d.manage().window().maximize();
		
		WebElement src=d.findElement(By.id("age"));
		
		Actions tt=new Actions(d);
		
		tt.moveToElement(src).perform();
		
		
		String exp="We ask";
		
		String act=d.findElement(By.className("ui-tooltip-content")).getText();
		System.out.println(act);
		
		
	  
  }
}







