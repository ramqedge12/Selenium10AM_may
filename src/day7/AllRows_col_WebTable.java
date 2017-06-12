package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllRows_col_WebTable {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("https://www.timeanddate.com/worldclock/");
		d.manage().window().maximize();
		
		
		
		for (int i = 1; i < 37; i++) 
		{
			
			String path="html/body/section[2]/div[1]/table/tbody/tr["+i+"]/td[5]";
			
			String text=d.findElement(By.xpath(path)).getText();
			
			System.out.println(text);
		}
		

	}

}







