package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Login_Jxl {
  
	@Test
  public void f() throws BiffException, IOException {
	  
	  
	  String path="E:\\workspace10am_may\\SeleniumProj\\testdata\\test.xls";
	  
	  FileInputStream fis=new FileInputStream(path);
	  Workbook wb=Workbook.getWorkbook(fis);
	  Sheet ws=wb.getSheet("Sheet1");
	  
	  
	  Sleeper.sleepTightInSeconds(2);
	  
	  WebDriver d=new FirefoxDriver();
		d.navigate().to(ws.getCell(2, 1).getContents());
		d.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(2);
		
		d.findElement(By.id("txtUsername")).sendKeys(ws.getCell(0, 1).getContents());
		d.findElement(By.id("txtPassword")).sendKeys(ws.getCell(1, 1).getContents());
		d.findElement(By.id("btnLogin")).click();
		
				
  }
}










