package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class All_LINKS {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("https://fb.com/");
		d.manage().window().maximize();
		
		// identify the No.of Links
		List<WebElement> links= d.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++) 
		{
			// get link name
		 String	str= links.get(i).getText();
		 System.out.println(str);
			
		}

	}

}






