package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class CheckBox12 {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://echoecho.com/htmlforms09.htm");
		d.manage().window().maximize();
		
		// identify checkboxes
	List<WebElement> check=d.findElements(By.
		xpath("//td[@class='table5']/input[@type='checkbox']"));
		System.out.println(check.size());
		
		Sleeper.sleepTightInSeconds(2);
		
		for (int i = 0; i < check.size(); i++) 
		{
			if(  ! check.get(i).isSelected())
			{
				check.get(i).click();
				
		System.out.println(check.get(i).getAttribute("value"));
			}
			
		}
		
		
	}

}
