package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rows_Cols_Webtable {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("https://www.timeanddate.com/worldclock/");
		d.manage().window().maximize();
		
		String path1="html/body/div[1]/div[8]/section[2]/table/tbody/tr[";
		String path2="]/td[";
		String path3="]";
		
		for (int i = 1; i <= 10; i++) 
		{
			for (int j = 1; j <= 5; j++) 
			{
				
		String text=d.findElement(By.xpath(path1+i+path2+j+path3)).getText();
				System.out.print(text+"   ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
