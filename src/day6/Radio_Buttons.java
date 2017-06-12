package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio_Buttons {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://echoecho.com/htmlforms10.htm");
		d.manage().window().maximize();
		
		//identify radio buttons
	List<WebElement>	radio=d.findElements(By.name("group1"));
	System.out.println(radio.size());
	
	for (int i = 0; i < radio.size(); i++) 
	{
		System.out.println(radio.get(i).getAttribute("value")+
				"------"+radio.get(i).getAttribute("checked"));
		
	}
	
	}

}






