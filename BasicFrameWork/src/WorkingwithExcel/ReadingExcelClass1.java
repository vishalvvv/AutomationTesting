package WorkingwithExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingExcelClass1 {
  @Test
  public void exceldata() throws IOException {
	  
	  FileInputStream f = new FileInputStream("C:\\Users\\Vishal\\Downloads\\Testing Tools\\Automation Testing\\basic Framework\\MyExcelData\\StudentName.xlsx");
	  
	  XSSFWorkbook w = new XSSFWorkbook(f);
	  XSSFSheet sht = w.getSheet("King");
	  
	String a =  sht.getRow(0).getCell(0).getStringCellValue();
	
	System.out.println(a);
	  
  }
}
