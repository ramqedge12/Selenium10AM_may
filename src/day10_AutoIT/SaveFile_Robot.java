package day10_AutoIT;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class SaveFile_Robot {
  @Test
  public void f() throws AWTException {
	  
	  WebDriver driver=new FirefoxDriver();
		driver.get("http://www.seleniumhq.org/download/");
		driver.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(3);
		
		// Click Browse bUTTON
		driver.findElement(By.linkText("3.4.0")).click();
		
		Sleeper.sleepTightInSeconds(3);

		Robot rb=new Robot();
		
		// Press Tab button
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		
		rb.delay(2000);
		
		// Press ENTER button
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	
  }
}





