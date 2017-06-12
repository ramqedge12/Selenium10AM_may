package log4j;




import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Log4j_Test {
  
	
	
	@Test
  public void f() {
		
		Logger log=Logger.getLogger(Log4j_Test.class);
		
		// configure XML file
		DOMConfigurator.configure("log4jjj.xml");
		
		WebDriver d=new FirefoxDriver();
		log.info("Br Launched");
		
		d.navigate().to("http://opensource.demo.orangehrmlive.com/");
		log.info("Url Entered");
		
		d.manage().window().maximize();
		log.info("MAximized");
		
		d.findElement(By.id("txtUsername")).sendKeys("Admin");
		log.info("UserNAme Entered");
		
		d.findElement(By.id("txtPassword")).sendKeys("admin");
		log.info("PSD Entered");
		
		d.findElement(By.id("btnLogin")).click();
		log.info("Clicked");
		
				
  }
}







