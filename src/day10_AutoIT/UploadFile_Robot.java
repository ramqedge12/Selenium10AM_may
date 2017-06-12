package day10_AutoIT;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class UploadFile_Robot {
  @Test
  public void f() throws AWTException {
	  
	        WebDriver driver=new FirefoxDriver();
			driver.get("http://toolsqa.com/automation-practice-form/");
			driver.manage().window().maximize();
			
			Sleeper.sleepTightInSeconds(3);
			
			// COpy file path
			StringSelection src=new StringSelection("C:\\Users\\Public\\Desert.jpg");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(src, null);
			
			// Click Browse Button
			driver.findElement(By.id("photo")).click();
			
			Robot robo=new Robot();
			
			//  Ctrl + V  (paste)
			robo.keyPress(KeyEvent.VK_CONTROL);
			robo.keyPress(KeyEvent.VK_V);
			
			robo.keyRelease(KeyEvent.VK_V);
			robo.keyRelease(KeyEvent.VK_CONTROL);
			
			Sleeper.sleepTightInSeconds(3);
			
			robo.keyPress(KeyEvent.VK_ENTER);
			robo.keyRelease(KeyEvent.VK_ENTER);
		
  }
}
