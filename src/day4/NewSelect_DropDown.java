package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NewSelect_DropDown {

	public static void main(String[] args) throws Exception {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://www.spicejet.com/");
		d.manage().window().maximize();
		
		//one way 
		d.findElement(By.id("ctl.....Trip_1")).click();
		//click leaving from
		d.findElement(By.id("ctl.....action")).click();
		Thread.sleep(2000);
		// hyderabad
		d.findElement(By.linkText("Hyderabad (HYD)")).click();
		Thread.sleep(2000);
		
		// BAnglore
		d.findElement(By.linkText("Bengaluru (BLR)")).click();
		Thread.sleep(2000);
		d.findElement(By.linkText("20")).click();
		Thread.sleep(2000);
		// ADULTS Drop dpwn
		new Select(d.findElement(By.id("ctl00....."))).
							selectByVisibleText("4 Adults");
		// Childs
		Thread.sleep(2000);
		new Select(d.findElement(By.id("ctl00.._Child"))).
								selectByVisibleText("1 Child");

		//click Search Flights
      d.findElement(By.id("ctl00_.......FindFlights")).click();
		
	}
}


