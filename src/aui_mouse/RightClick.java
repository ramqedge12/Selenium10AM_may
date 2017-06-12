package aui_mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class RightClick {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://google.com");
		d.manage().window().maximize();
		
		WebElement src=d.findElement(By.linkText("Gmail"));
		
		Actions rc=new Actions(d);
		Sleeper.sleepTightInSeconds(2);
		
		rc.contextClick(src).sendKeys("W").click().build().perform();
		
		//  OR
		
		rc.contextClick(src).sendKeys(Keys.ARROW_DOWN).click().build().perform();
		
		
		
	}

}












