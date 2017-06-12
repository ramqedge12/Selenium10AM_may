package day8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Implicit_Wait {

	public static void main(String[] args) throws Exception  {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("https://paytm.com/");
		d.manage().window().maximize();
		
		// Implicit Wait
	    d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//click login link
		d.findElement(By.xpath(".//*[@id='app']/div/div[2]/div[2]/div[3]/div[3]/div")).click();

	}

}



