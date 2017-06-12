package excel;

import org.testng.annotations.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;

public class Excel_Fill_Colors {
  @Test
  public void f() throws IOException {
	  
	  Workbook workbook = new XSSFWorkbook();
	    Sheet sheet = workbook.createSheet("Color Test");
	    Row row = sheet.createRow(0);

	    // CEll Style
	    CellStyle style = workbook.createCellStyle();
	    style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
	    style.setFillPattern(CellStyle.ALIGN_RIGHT);
	   
	    // FONT style
	    Font font = workbook.createFont();
          font.setColor(IndexedColors.BLUE.getIndex());
          style.setFont(font);
      
	    Cell cell1 = row.createCell(0);
	    cell1.setCellValue("ID");
	    //row.createCell(1).setCellValue("PASSSSSS"); 
	    cell1.setCellStyle(style);
	    
	    Cell cell2 = row.createCell(1);
	    cell2.setCellValue("NAME");
	    cell2.setCellStyle(style);

	    FileOutputStream fos =new FileOutputStream(new File("D:/10am.xlsx"));
	    workbook.write(fos);
	    fos.close();
	    
	    
	    System.out.println(" Exel test case Done");
	      
	}
	  
 
}



