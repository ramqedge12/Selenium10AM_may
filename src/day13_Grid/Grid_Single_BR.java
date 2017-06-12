package day13_Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import bsh.Remote;

public class Grid_Single_BR {
  @Test
  public void f() throws MalformedURLException {
	  
	  DesiredCapabilities cap=DesiredCapabilities.firefox();
	  
	  cap.setBrowserName("firefox");
	  cap.setPlatform(Platform.WINDOWS);
	  
	  
	  RemoteWebDriver driver=new RemoteWebDriver
			     (new URL("http://localhost:4444/wd/hub"), cap);
	
	  driver.get("http://fb.com");
	  
  }
}



