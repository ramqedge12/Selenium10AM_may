package excel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.testng.annotations.Test;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Excel_Write_JXL {
  @Test
  public void f() throws IOException, RowsExceededException, WriteException {
	  
	  String path="E:\\workspace10am_may\\testop.xls";
	  
	  FileOutputStream fos=new FileOutputStream(path);
	  WritableWorkbook wb=Workbook.createWorkbook(fos);
	  WritableSheet ws=wb.createSheet("output", 0);
	  
	  Label un=new Label(3, 0, "pass");
	  ws.addCell(un);
	  
	  Label obj=new Label(5, 3, "fail");
	  ws.addCell(obj);
	  
	  wb.write();
	  wb.close();
	  
  }
}





