package day12_JavaScript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Cookies_Testing {
  @Test
  public void f() {
	  
	  WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://paytm.com/");
		driver.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(30);
		
		 Set<Cookie> cookies =driver.manage().getCookies();
		 System.out.println(cookies.size());
		 
		 Sleeper.sleepTightInSeconds(30);
		 Iterator<Cookie> it= cookies.iterator();
		 while (it.hasNext())
		 {
			 Cookie ck= it.next();
			 
			 System.out.println(ck.getName()+"-----"+
			            ck.getDomain()+"------"+ck.getValue());
		}
		 driver.manage().deleteAllCookies();
		 Sleeper.sleepTightInSeconds(30);
		 cookies =driver.manage().getCookies();
		 System.out.println(cookies.size());
		 
	  
  }
}
