package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE_Browser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				    "E:\\workspace10am_may\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("http://fb.com");

	}

}






