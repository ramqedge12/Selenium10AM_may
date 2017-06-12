package com.ProjName.TestExe_Main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.ProjName.ReuseFun.ReUse_Hybid;

public class Hybrid_Test {
  @Test
  public void f() throws IOException 
  {
	  ReUse_Hybid obj=new ReUse_Hybid();
	  
	//Excel
	  String fispath="E:\\workspace10am_may\\SeleniumProj\\src\\com\\ProjName\\TestData\\HybridTest.xlsx";
	  String fospath="E:\\workspace10am_may\\SeleniumProj\\src\\com\\ProjName\\TestResults\\output.xlsx";	  
	 
	  FileOutputStream fos=new FileOutputStream(fospath);
	  
	  FileInputStream f1 = new FileInputStream(fispath);
	  XSSFWorkbook wd = new XSSFWorkbook(f1);
	  XSSFSheet ws = wd.getSheet("Sheet1");
	  XSSFSheet ws3 = wd.getSheet("Sheet3");
	  
	  
	  
	  String exlUrl=ws.getRow(1).getCell(0).getStringCellValue();
	  
	  // launch
	  String res=obj.launchApp(exlUrl);
	  ws.getRow(1).createCell(1).setCellValue(res);
	  
	  // Login 
	  
	 String un= ws3.getRow(1).getCell(0).getStringCellValue();
	 String psdd= ws3.getRow(1).getCell(1).getStringCellValue();
	
	res= obj.loginApp(un, psdd);
	ws3.getRow(1).createCell(2).setCellValue(res);
	  
	  wd.write(fos);
	  wd.close();
	  
	  
  }
}
