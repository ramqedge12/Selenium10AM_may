package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Excel_Read_POI {
  @Test
  public void f() throws IOException {
	  
      String path=
         "E:\\workspace10am_may\\SeleniumProj\\testdata\\testpoi.xlsx";
	  
	  FileInputStream fis=new FileInputStream(path);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  XSSFSheet ws=wb.getSheetAt(0);
	  
	  // lAUNCH APP
	  WebDriver d=new FirefoxDriver();
	  
		
		Sleeper.sleepTightInSeconds(2);
		
		int rc= ws.getLastRowNum();
		
		for (int j = 0; j <= rc ; j++) 
		{
			
			d.get(ws.getRow(j).getCell(2).getStringCellValue());
			  d.manage().window().maximize();
		
		d.findElement(By.id("txtUsername")).sendKeys(ws.getRow(j).getCell(0).getStringCellValue());
		d.findElement(By.id("txtPassword")).sendKeys(ws.getRow(j).getCell(1).getStringCellValue());
		d.findElement(By.id("btnLogin")).click();
		
		d.close();
		
		
		}
	  
	  
  }
}











