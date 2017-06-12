package aui_mouse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Dynamic_Xpath {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://yahoo.com");
		d.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(2);
		// identify Search Box
		d.findElement(By.id("uh-search-box")).sendKeys("selenium");

		// Identify Ajax control elements
		List<WebElement> items=d.findElements(By.xpath
			("//*[starts-with(@id,'yui_3_18_0_3_14951')]/li"));
		System.out.println(items.size());
		
		Sleeper.sleepTightInSeconds(2);
		
		// click Selenium tutorial
		items.get(2).click();	
	}

}
