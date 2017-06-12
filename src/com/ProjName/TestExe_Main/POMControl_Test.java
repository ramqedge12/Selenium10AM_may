package com.ProjName.TestExe_Main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import com.ProjName.ReuseFun.RegisterMercuryTours_Page2;

import com.ProjName.ReuseFun.RegisterMercuryTours_Validation_Page3;

import com.ProjName.ReuseFun.WelcomeMercuryTours_page1;

public class POMControl_Test {
	
	public WebDriver driver;
	
	@Test
	public void pomTest() throws IOException
	{
		//System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		
		FileInputStream f=new FileInputStream("E:\\workspace10am_may\\SeleniumProj\\src\\com\\ProjName\\TestData\\Datadriventesting.xlsx");
	    @SuppressWarnings("resource")
		
	    XSSFWorkbook wb=new XSSFWorkbook(f);
	    XSSFSheet ws=wb.getSheet("Sheet3");
	  
	    Iterator<Row> row=ws.iterator();
	   row.next();
	 
	   // class objects
	   WelcomeMercuryTours_page1 wm=PageFactory.initElements(driver,WelcomeMercuryTours_page1.class);
	    RegisterMercuryTours_Page2 rm1=PageFactory.initElements(driver,RegisterMercuryTours_Page2.class);
	    RegisterMercuryTours_Validation_Page3 rm2=PageFactory.initElements(driver,RegisterMercuryTours_Validation_Page3.class);
	    
	   wm.registerTest();
	   
	   while(row.hasNext())
	    {
	    	Row r=row.next();
	    	
	    	rm1.contactRegistration(r);
	    	
	    	Sleeper.sleepTightInSeconds(1);
	    	
	    
	    	boolean b=rm2.validateRegistration(r.getCell(9).getStringCellValue());
	    	
	    	//Cell c=r.createCell(12);
	    	
	    	if(b==true)
	       {
	 
	    		r.createCell(12).setCellValue("Passed");
	       }
	       else
	       {
	    	   r.createCell(12).setCellValue("Failed");
	       }
	    	driver.navigate().back();
	    }
	    
	   
	   FileOutputStream f1=new FileOutputStream("E:\\workspace10am_may\\SeleniumProj\\src\\com\\ProjName\\TestResults\\POmoutput.xlsx");
	   
	   wb.write(f1);
	    f1.close();
	    
	}

}






