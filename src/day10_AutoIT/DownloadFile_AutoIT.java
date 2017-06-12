package day10_AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class DownloadFile_AutoIT {
  @Test
  public void f() throws IOException {
	  
	  WebDriver driver=new FirefoxDriver();
		driver.get("http://www.seleniumhq.org/download/");
		driver.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(3);
		
		// Click Browse bUTTON
		driver.findElement(By.linkText("3.4.0")).click();
		
		Sleeper.sleepTightInSeconds(3);
		
		Runtime.getRuntime().exec("E:\\workspace10am_may\\SeleniumProj\\AutoIT\\savefile.exe");
	  
	  
  }
  
  
  
}
