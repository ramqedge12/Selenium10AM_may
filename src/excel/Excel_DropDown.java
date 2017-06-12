package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Excel_DropDown {
  @Test
  public void f() throws IOException {
	  
	  String path="E:\\workspace10am_may\\SeleniumProj\\testdata\\testpoi.xlsx";
	  
	  FileInputStream fis=new FileInputStream(path);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  XSSFSheet ws=wb.getSheet("Sheet3");
	  
	  WebDriver d=new FirefoxDriver();
		d.navigate().to("http://newtours.demoaut.com/");
		d.manage().window().maximize();
		
		d.findElement(By.linkText("REGISTER")).click();
		
		//identify drop down
		WebElement drop= d.findElement(By.name("country"));
	
		//identify elements from drop down	
	   List<WebElement> items= drop.findElements(By.tagName("option"));
		System.out.println(items.size());
		
		Row r=null;
		
		
		for (int i = 0; i < items.size(); i++) 
		{
			String str= items.get(i).getText();
			
			r=ws.createRow(i);
			r.createCell(0).setCellValue(str);
			
			items.get(i).click();
			
			if(items.get(i).isSelected())
			{
				r.createCell(1).setCellValue("TRUE");
			}
			else
			{
				ws.createRow(i).createCell(1).setCellValue("FALSE");
			}
			
			}
	  
	  FileOutputStream fos1=new FileOutputStream("E:\\workspace10am_may\\SeleniumProj\\testdata\\\\test123.xlsx");
	  
	  wb.write(fos1);
	  fos1.close();
  }


}
