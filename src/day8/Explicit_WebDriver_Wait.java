package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Explicit_WebDriver_Wait {
  @Test
  public void f() {
	  
	  WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.24hourfitness.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		// Click Learn more link
		wait.until(ExpectedConditions.visibilityOfElementLocated
				(By.xpath("html/body/div[4]/div[1]/div[2]/div/div[2]/div[3]/div/a"))).click();
		
		
  }
}




