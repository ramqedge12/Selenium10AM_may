package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validation_HRM {

	public static void main(String[] args) throws Exception{
		//Launch App
		
		WebDriver d=new FirefoxDriver();
	
		d.navigate().to("http://opensource.demo.orangehrmlive.com/");
		d.manage().window().maximize();
		
		String exp = "OrangeHRM";
		
		String act= d.getTitle();
		System.out.println("The Actuall Title is==="+act);
		
		if(exp.equals(act))
		{
			System.out.println("Launch Suceesssss");
		}
		else
		{
			System.out.println("Launch not Suceesssss");
		}
		
		//Login App
		
		String exp1="Welcome ADMIN";
		
		d.findElement(By.id("txtUsername")).sendKeys("Admin");
		d.findElement(By.id("txtPassword")).sendKeys("admin");
		d.findElement(By.id("btnLogin")).click();
		
		String str= d.findElement(By.id("welcome")).getText();
		
		if (exp1.equalsIgnoreCase(str)) 
		{
			System.out.println("login Suceessss");
		}
		else
		{
			System.out.println("login not Suceessss");
		}
		
		//Logout
		Thread.sleep(2000);
		d.findElement(By.id("welcome")).click();
		
		Thread.sleep(2000);
		
		d.findElement(By.linkText("Logout")).click();
		
		//Close APP
		
		Thread.sleep(2000);
		d.close();
		
		
		
	}

}












