package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDown_Elemnets_select {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://newtours.demoaut.com/");
		d.manage().window().maximize();
		
		d.findElement(By.linkText("REGISTER")).click();
		
		//identify drop down
		WebElement drop= d.findElement(By.name("country"));
	
		//identify elements from drop down	
	List<WebElement> items= drop.findElements(By.tagName("option"));
		System.out.println(items.size());
		
		for (int i = 0; i < items.size(); i++) 
		{
			String str= items.get(i).getText();
			
			items.get(i).click();
			//if item is selected
			if(items.get(i).isSelected())
			{
				System.out.println("item is working---- "+ str);
			}
			else
			{
				System.out.println("item is not working---- "+ str);
			}
			
		}
	}

}
