package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Links_URLs {

	public static void main(String[] args) {
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp= pr.getProfile("selenium10may");

		WebDriver d=new FirefoxDriver(fp);
		d.navigate().to("http://google.com/");
		d.manage().window().maximize();
		
		//identify no.of links
		List<WebElement> links= d.findElements(By.tagName("a"));
		System.out.println(links.size());
	
		for (int i = 0; i < links.size(); i++) 
		{
			// IF link text is not empty (  i.e  VIsible Link  )
			if(  ! links.get(i).getText().isEmpty())
			{
			links.get(i).click();
			
			String url= d.getCurrentUrl();
			System.out.println(url);
			
			d.navigate().back();
			
			links=	d.findElements(By.tagName("a"));
			}
			else
			{
				System.out.println("link is invisible----"+i);
			}
		}
	}

}



