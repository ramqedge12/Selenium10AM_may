package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDown {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("https://www.amazon.com/");
		d.manage().window().maximize();
		
		// identify Drop down
		
		d.findElement(By.xpath(".//*[@id='.....]")).sendKeys("Books");
		
		// search box
		d.findElement(By.xpath("html/.../input")).sendKeys("java");
		
		// search button
		d.findElement(By.xpath(".//*[@id='n.......put")).click();
		
	}

}



