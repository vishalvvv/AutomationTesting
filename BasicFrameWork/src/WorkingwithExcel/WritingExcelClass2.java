package WorkingwithExcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WritingExcelClass2 {
  @Test
  public void exceldata() throws IOException {
	  
	  FileInputStream fis = new FileInputStream("C:\\Users\\Vishal\\Downloads\\Testing Tools\\Automation Testing\\basic Framework\\MyExcelData\\StudentName.xlsx");
	  
	  XSSFWorkbook w = new XSSFWorkbook(fis);
	  XSSFSheet sht = w.getSheet("Queen");
	  
	      XSSFRow r0 = sht.createRow(0);
	      XSSFCell r0c0 = r0.createCell(0);
	      
	      r0c0.setCellValue("Ringa Ringa Roses");
	      
	      XSSFRow r22 = sht.createRow(22);
	      XSSFCell r22c17 = r22.createCell(17);
	      
	      
	      r22c17.setCellValue("Jack and Jill");

	      FileOutputStream fos = new FileOutputStream("C:\\Users\\Vishal\\Downloads\\Testing Tools\\Automation Testing\\basic Framework\\MyExcelData\\\\StudentName.xlsx");
	 
	  w.write(fos);
	  
  }
}
