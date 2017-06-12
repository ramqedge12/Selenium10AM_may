package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class CssSelector1 {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://amazon.com");
		d.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(2);
		
		d.findElement(By.cssSelector
			("div.nav-search-field >input#twotabsearchtextbox")).
		                                   sendKeys("java");

	}

}




