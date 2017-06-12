package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class RadioButton2 {
	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://echoecho.com/htmlforms10.htm");
		d.manage().window().maximize();
		
		//loop for groups
		for (int i = 1; i <= 2; i++) 
		{
			List<WebElement> radio=d.findElements(By.name("group"+i));
			
			//loop for click radio
			for (int j = 0; j < radio.size(); j++) 
			{
				Sleeper.sleepTightInSeconds(1);
				radio.get(j).click();
				
				// loop for print radio values
				for (int k = 0; k < radio.size(); k++) 
				{
				String str1=radio.get(k).getAttribute("value");
				String str2=	radio.get(k).getAttribute("checked");
				
				System.out.println(str1+"----"+str2);
				}
				
				System.out.println("**********************");
			}
		}
	}
}










