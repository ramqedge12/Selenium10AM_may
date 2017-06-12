package day10_AutoIT;

import java.awt.datatransfer.StringSelection;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class FileUpload_AutoIT {
  @Test
  public void f() throws IOException {
	  
	  WebDriver driver=new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(3);
		
		// Click Browse bUTTON
		driver.findElement(By.id("photo")).click();
		
		Sleeper.sleepTightInSeconds(3);
		
		//Execute AutoIT script
		Runtime.getRuntime().exec("E:\\workspace10am_may\\SeleniumProj\\AutoIT\\Upload.exe");
		
		
  }
}
