package WorkingwithExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadingExcelClass6 {
  @Test
  public void exceldata() throws IOException {
	  
	  FileInputStream f = new FileInputStream("C:\\Users\\Vishal\\Downloads\\Testing Tools\\Automation Testing\\basic Framework\\MyExcelData\\Mystudents.xls");
	  
	  HSSFWorkbook w = new HSSFWorkbook(f);
	  HSSFSheet sht = w.getSheet("king");
	  
	  System.out.println("The Number of records in the given sheet is:"+ (sht.getLastRowNum()+1));
	 
	 for(int k=0;k<=sht.getLastRowNum();k++) {
		 System.out.println(sht.getRow(k).getCell(0).getStringCellValue());
	 }
  }
}
