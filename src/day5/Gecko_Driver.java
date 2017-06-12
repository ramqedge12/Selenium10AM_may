package day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gecko_Driver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", 
				     "E:\\workspace10am_may\\geckodriver.exe");
		
		WebDriver d=new FirefoxDriver();
		d.get("http://fb.com");

	}

}
