package aui_mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Mouse_Hover {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("https://www.emirates.com");
		d.manage().window().maximize();
		
		// identify the EXPERIENCE Elemnet
		WebElement exp=d.findElement(By.xpath(".//*[@id='']/a/span[1]"));
		
		// identify the BOOK Elemnet
		WebElement book=d.findElement(By.xpath(".//*[@id='book']span[1]"));
		
		Sleeper.sleepTightInSeconds(3);
		
		Actions obj=new Actions(d);
		
		obj.moveToElement(exp).perform();
		
		Sleeper.sleepTightInSeconds(2);
		
		obj.moveToElement(book).perform();
		
		// OR 
		
		//obj.moveToElement(book).moveToElement(exp).build().perform();

	}

}














