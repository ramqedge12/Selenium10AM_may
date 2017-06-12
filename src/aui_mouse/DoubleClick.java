package aui_mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class DoubleClick {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://google.com");
		d.manage().window().maximize();
		
		WebElement src=d.findElement(By.linkText("Gmail"));
		
		Actions dc=new Actions(d);
		Sleeper.sleepTightInSeconds(2);
		
		dc.doubleClick(src).perform();
		
		// Example for clickAndHold
		dc.clickAndHold(src).moveToElement(src).release(src).build().perform();
		
		
		
		
	}

}











