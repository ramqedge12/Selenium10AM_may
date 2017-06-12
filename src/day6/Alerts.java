package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Alerts {

	public static void main(String[] args) throws Exception{
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://primusbank.qedgetech.com/");
		d.manage().window().maximize();
		
		d.findElement(By.id("login")).click();
		
		// click Login button
		Sleeper.sleepTightInSeconds(2);
		
		// Get Alert Text
		String msg= d.switchTo().alert().getText();
		System.out.println(msg);
		
		Thread.sleep(2000);
		
		// Click OK button
		d.switchTo().alert().accept();
		
	}

}



