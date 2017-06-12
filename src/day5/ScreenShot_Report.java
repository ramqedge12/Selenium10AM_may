package day5;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot_Report {

	public static void main(String[] args) throws IOException {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://opensource.demo.orangehrmlive.com/");
		d.manage().window().maximize();
		
		String exp = "orangeHRM";
		
		String act= d.getTitle();
		System.out.println("The Actuall Title is==="+act);
		
		if(exp.equals(act))
		{
			System.out.println("Launch App is Pass");
		}
		else
		{
			File src=((TakesScreenshot)d).getScreenshotAs
					                      (OutputType.FILE);
		
			FileUtils.copyFile(src, new File
					  ("E:\\workspace10am_may\\Screens\\launch.jpg"));
		
			System.out.println("Launch App is FAIL");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
