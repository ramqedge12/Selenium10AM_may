package day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Element_Present {

	@Test
	public void aaaaa(){
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("https://www.icicibank.com");
		d.manage().window().maximize();
		
		String src = d.getPageSource();
		System.out.println(src);
		
		if(src.contains("help"))
			System.out.println("element is present");
		else
			System.out.println("element is not present");
		
	}

}
