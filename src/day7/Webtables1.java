package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webtables1 {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("https://www.timeanddate.com/worldclock/");
		d.manage().window().maximize();
		
		//identify Webtable
		WebElement table= d.findElement(By.xpath
			("html/body/div[1]/div[8]/section[2]/div[1]/table"));

		// identify rows from webtable
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		
		//loop for rows 
		for (int i = 0; i < rows.size(); i++) 
		{
			// identify columns from rows
	List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
		System.out.println(cols.size());
			
			// loop for columns
			for (int j = 0; j < cols.size(); j++) 
			{
				String name=cols.get(j).getText();
				System.out.print(name+"   ");
			}
			
			System.out.println();
		}	
	}
}













