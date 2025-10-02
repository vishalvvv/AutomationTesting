package WorkingwithExcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WritingExcelClass1 {
  @Test
  public void exceldata() throws IOException {
	  
	  FileInputStream fis = new FileInputStream("C:\\Users\\Vishal\\Downloads\\Testing Tools\\Automation Testing\\basic Framework\\MyExcelData\\StudentName.xlsx");
	  
	  XSSFWorkbook w = new XSSFWorkbook(fis);
	  XSSFSheet sht = w.getSheet("Queen");
	  
	      XSSFRow r0 = sht.createRow(0);
	      XSSFCell r0c0 = r0.createCell(0);
	      
	      r0c0.setCellValue("No Pain,No Gain");

	      FileOutputStream fos = new FileOutputStream("C:\\Users\\Vishal\\Downloads\\Testing Tools\\Automation Testing\\basic Framework\\MyExcelData\\\\StudentName.xlsx");
	 
	  w.write(fos);
	  
  }
}
