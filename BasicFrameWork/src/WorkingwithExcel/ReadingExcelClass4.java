package WorkingwithExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingExcelClass4 {
  @Test
  public void exceldata() throws IOException {
	  
	  FileInputStream f = new FileInputStream("C:\\Users\\Vishal\\Downloads\\Testing Tools\\Automation Testing\\basic Framework\\MyExcelData\\StudentName.xlsx");
	  
	  XSSFWorkbook w = new XSSFWorkbook(f);
	  XSSFSheet sht = w.getSheet("King");
	  
	 System.out.println("The Number of records in the given sheet is:"+ (sht.getLastRowNum()+1));
	 
	 for(int k=0;k<=sht.getLastRowNum();k++) {
		 System.out.println(sht.getRow(k).getCell(0).getStringCellValue());
	 }
	  
  }
}
