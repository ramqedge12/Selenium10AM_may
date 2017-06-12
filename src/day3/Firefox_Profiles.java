package day3;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class Firefox_Profiles {

	public static void main(String[] args) {
		
		// create profile obj
		ProfilesIni pr=new ProfilesIni();
		
		//get profile
	   FirefoxProfile fp=	pr.getProfile("selenium10may");
		
		WebDriver d=new FirefoxDriver(fp);
		
		d.get("http://fb.com");
		
		
	}
}



