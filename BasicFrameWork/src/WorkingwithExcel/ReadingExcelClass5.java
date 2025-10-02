package WorkingwithExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadingExcelClass5 {
  @Test
  public void exceldata() throws IOException {
	  
	  FileInputStream f = new FileInputStream("C:\\Users\\Vishal\\Downloads\\Testing Tools\\Automation Testing\\basic Framework\\MyExcelData\\StudentName.xlsx");
	  
	  XSSFWorkbook w = new XSSFWorkbook(f);
	  XSSFSheet sht = w.getSheet("Hello");
	  
	 String UN = sht.getRow(1).getCell(0).getStringCellValue();
	 String PWD = sht.getRow(1).getCell(1).getStringCellValue();
	 
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  WebDriver	 driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(UN);
		driver.findElement(By.xpath("//input[@tabindex='2']")).sendKeys(PWD );
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	  
  }
}
