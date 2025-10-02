package RunningOrangeHRM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;


public class Scripting extends ReusedMethods {
	
	public void login() throws IOException {
		  

		driver.get(obj.getProperty("URL"));
		xp("XUN").sendKeys(obj.getProperty("UN"));
		xp("XPWD").sendKeys(obj.getProperty("PWD"));
		xp("XSUB").click();
		
		s("After Login");
  }

	 // create a method to add one employee
	
	public void oneemp() throws InterruptedException, AWTException {
		t(1);
		Actions A = new Actions(driver);
		A.moveToElement(xp("XPIM")).perform();
		t(1);
		xp("XADD").click();
		t(1);
		driver.switchTo().frame(xp("XFRAME"));
		t(1);
		xp("XID").sendKeys("442233");
		xp("XFIRST").sendKeys("Rose");
		xp("XLAST").sendKeys("Jasmine");
		xp("XMID").sendKeys("Sunflower");
		xp("XNICK").sendKeys("Running");
		t(1);
		A.moveToElement(xp("XPHOTO")).click().perform();
		
		t(1);
		
		StringSelection ss = new StringSelection("C:\\Users\\Vishal\\Downloads\\Testing Tools\\Manual Testing");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		t(2);
		
		Robot R = new Robot();
		
		R.keyPress(KeyEvent.VK_CONTROL);
		R.keyPress(KeyEvent.VK_V);
		R.keyRelease(KeyEvent.VK_CONTROL);
		R.keyRelease(KeyEvent.VK_V);
		
		t(1);
		
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
		

		t(1);
		xp("XSAVE").click();
		t(3);
		xp("XBACK").click();
		
		
		
		
	}
	
	// create a method to add one employee from excel
	
	public void oneempexcel() throws InterruptedException, AWTException, IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Vishal\\Automation Testing\\Batch9am_OrangeHRM\\src\\data\\java\\MyDataPack\\OrangeHRM.xlsx");
		
		XSSFWorkbook w = new XSSFWorkbook(fis);
		XSSFSheet sht = w.getSheet("CreateEmployee");
		
		int eid  = (int) sht.getRow(1).getCell(0).getNumericCellValue();
	//	System.out.println(eid);
		String efirst  = sht.getRow(1).getCell(1).getStringCellValue();
		String elast  = sht.getRow(1).getCell(2).getStringCellValue();
		String emid  = sht.getRow(1).getCell(3).getStringCellValue();
		String enick  = sht.getRow(1).getCell(4).getStringCellValue();
		t(1);
		Actions A = new Actions(driver);
		A.moveToElement(xp("XPIM")).perform();
		t(1);
		xp("XADD").click();
		t(1);
		driver.switchTo().frame(xp("XFRAME"));
		t(1);
		xp("XID").sendKeys(String.valueOf(eid));
		xp("XFIRST").sendKeys(efirst);
		xp("XLAST").sendKeys(elast);
		xp("XMID").sendKeys(emid);
		xp("XNICK").sendKeys(enick);
		t(1);
		A.moveToElement(xp("XPHOTO")).click().perform();
			t(1);
		
		StringSelection ss = new StringSelection("C:\\Users\\Vishal\\Downloads\\Testing Tools\\Manual Testing");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		t(2);
		
		Robot R = new Robot();
	
		R.keyPress(KeyEvent.VK_CONTROL);
		R.keyPress(KeyEvent.VK_V);
		R.keyRelease(KeyEvent.VK_CONTROL);
		R.keyRelease(KeyEvent.VK_V);
		
	t(1);
	
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
		

 	t(1);
		xp("XSAVE").click();
		t(3);
	xp("XBACK").click();
		
		
		
		
	}
	
	// create a method to add multiple employees from excel
	
public void multipleemployees() throws InterruptedException, AWTException, IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Vishal\\Automation Testing\\Batch9am_OrangeHRM\\src\\data\\java\\MyDataPack\\OrangeHRM.xlsx");
		
		XSSFWorkbook w = new XSSFWorkbook(fis);
		XSSFSheet sht = w.getSheet("CreateEmployee");
		
		for(int i=1;i<=sht.getLastRowNum();i++) {
		int eid  = (int) sht.getRow(i).getCell(0).getNumericCellValue();
	//	System.out.println(eid);
		String efirst  = sht.getRow(i).getCell(1).getStringCellValue();
		String elast  = sht.getRow(i).getCell(2).getStringCellValue();
		String emid  = sht.getRow(i).getCell(3).getStringCellValue();
		String enick  = sht.getRow(i).getCell(4).getStringCellValue();
		
		System.out.println(efirst);
		t(1);
		Actions A = new Actions(driver);
		A.moveToElement(xp("XPIM")).perform();
		t(1);
		xp("XADD").click();
		t(1);
		driver.switchTo().frame(xp("XFRAME"));
		t(1);
		xp("XID").sendKeys(String.valueOf(eid));
		xp("XFIRST").sendKeys(efirst);
		xp("XLAST").sendKeys(elast);
		xp("XMID").sendKeys(emid);
		xp("XNICK").sendKeys(enick);
		t(1);
		A.moveToElement(xp("XPHOTO")).click().perform();
			t(1);
		
		StringSelection ss = new StringSelection("C:\\Users\\Vishal\\Automation Testing\\Batch9am_OrangeHRM\\EmpPhotos\\"+efirst+".jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		t(2);
		
		Robot R = new Robot();
	
		R.keyPress(KeyEvent.VK_CONTROL);
		R.keyPress(KeyEvent.VK_V);
		R.keyRelease(KeyEvent.VK_CONTROL);
		R.keyRelease(KeyEvent.VK_V);
		
	t(1);
	
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
		

 	t(1);
 	 s(efirst+"_Before Save");
		xp("XSAVE").click();
		t(3);
		s(efirst+"_After Save");
	xp("XBACK").click();
	driver.switchTo().defaultContent();
	t(1);
		s(efirst+"_After Add");
		
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
