package com.ProjName.TestExe_Main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Properties_Exe {
  @Test
  public void f() throws IOException {
	  
	  // Properties file
	  
	  String path="E:\\workspace10am_may\\SeleniumProj\\src\\com\\ProjName\\Properties\\prop.properties";
	  String path12="E:\\workspace10am_may\\SeleniumProj\\src\\com\\ProjName\\TestData\\LoginKeywords.xlsx";
	  
	  
	  FileInputStream fis=new FileInputStream(path);
	  Properties pr=new Properties();
	  pr.load(fis);
	  
	  // Excel App
	  
	  FileInputStream fexl=new FileInputStream(path12);
	  XSSFWorkbook wb=new XSSFWorkbook(fexl);
		XSSFSheet ws=wb.getSheet("Sheet1");

	  
	  //launch app
	  
	  WebDriver d=new FirefoxDriver();
	  d.get(ws.getRow(2).getCell(4).getStringCellValue());
	  d.manage().window().maximize();
	  
	  //login app
	  
	  d.findElement(By.id(pr.getProperty("un"))).sendKeys(ws.getRow(3).getCell(4).getStringCellValue());
	  d.findElement(By.id(pr.getProperty("psd"))).sendKeys(ws.getRow(4).getCell(4).getStringCellValue());
	  
	  d.findElement(By.id(pr.getProperty("logbtn"))).click();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
