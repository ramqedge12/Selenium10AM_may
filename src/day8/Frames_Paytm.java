package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Frames_Paytm {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("https://paytm.com/");
		d.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(3);
		
		//click login link
		d.findElement(By.xpath(".//*[@id='app']/div")).click();
		
		//identify no.of frames
		List<WebElement> frames= d.findElements(By.tagName("iframe"));
		
		System.out.println(frames.size());
		
		Sleeper.sleepTightInSeconds(3);
		
		for (int i = 0; i < frames.size(); i++) 
		{
			// switch to frames
			d.switchTo().frame(i);
		
			try 
			{
				// UserNAme
				d.findElement(By.id("input_0")).sendKeys("987876876");
				
				// PASS WORD
				d.findElement(By.id("input_1")).sendKeys("9878abcdcd");
			} 
			catch (Exception e) 
			{
				System.out.println(e.getMessage());
			}
			
			// SWITCH TO main window
			d.switchTo().defaultContent();	
		}
	}

}


