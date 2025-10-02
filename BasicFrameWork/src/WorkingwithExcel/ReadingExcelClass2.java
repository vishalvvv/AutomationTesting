package WorkingwithExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingExcelClass2 {
  @Test
  public void exceldata() throws IOException {
	  
	  FileInputStream f = new FileInputStream("C:\\Users\\Vishal\\Downloads\\Testing Tools\\Automation Testing\\basic Framework\\MyExcelData\\StudentName.xlsx");
	  
	  XSSFWorkbook w = new XSSFWorkbook(f);
	  XSSFSheet sht = w.getSheet("King");
	  
	  for(int u=0;u<=58;u++) {
	String a =  sht.getRow(u).getCell(0).getStringCellValue();
	
	System.out.println(a);
	
	  }
	  
  }
}
