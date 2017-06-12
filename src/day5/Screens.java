package day5;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screens {

	public static void main(String[] args) throws IOException {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://www.seleniumhq.org/download/");
		d.manage().window().maximize();
		
	File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File
				    ("E:\\workspace10am_may\\Screens\\app1.png"));
	}
}






