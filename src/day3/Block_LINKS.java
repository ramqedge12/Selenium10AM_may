package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Block_LINKS {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("https://bing.com/");
		d.manage().window().maximize();
		
		// identify the Block
		WebElement block= d.findElement(By.id("sc_hdu"));
		
		//Identify the links from block
		List<WebElement> link= block.findElements(By.tagName("a"));
		int count=link.size();
		System.out.println(count);
		
		for (int i = 0; i < count ; i++) 
		{
			String str=link.get(i).getText();
			System.out.println(str);
		}
	}

}





