package RunningKosmikHMS;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Scripting extends ReusedMethods {
  @Test
  public void login() throws IOException {
	  
	  driver.get(obj.getProperty("URL"));
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys(obj.getProperty("UN"));
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(obj.getProperty("PWD"));
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  

		
	  }
  
  public void onepatient() throws InterruptedException, AWTException {
	 
	
	  t(1);
	   xp("XREG").click();
	  
		  
		  xp("XFIRSTNAME").sendKeys("john");
		  xp("XMIDDLENAME").sendKeys("anthony");
		  xp("XLASTNAME").sendKeys("cena");
		  xp("XAGE").sendKeys("48");
		  xp("XMOTHERNAME").sendKeys("elizabeth hastwood");
		  xp("XIDPROOF").sendKeys("47jyrf8g");
		  xp("XADDRESS").sendKeys("hyderabad");
		  xp("XMOBILENUMBER").sendKeys("7894578945");
		  xp("XADDRESS1").sendKeys("kphb roadno1");
		  xp("XADDRESS2").sendKeys("kukatpally");
		  xp("XZIP").sendKeys("500072");
		  xp("XEMAIL").sendKeys("john123@wwe.com");
		  
		 WebElement patientdropdown =xp("XPATIENT");
			   Select patientselect = new Select(patientdropdown);
			   List<WebElement> patientoptions = patientselect.getOptions();
			   Actions patientactions = new Actions(driver);
			   for(int i=0;i<patientoptions.size();i++) {
				  patientactions.moveToElement(patientdropdown).perform();
				  patientselect.selectByIndex(i);
			   }
			   
			   WebElement relationdropdown = xp("XRELATION");
			   Select relationselect = new Select(relationdropdown);
			   List<WebElement> relationoptions = relationselect.getOptions();
			   Actions relationactions = new Actions(driver);
			   for(int i=0;i<relationoptions.size();i++) {
				 relationactions.moveToElement(relationdropdown).perform();
				 relationselect.selectByIndex(i);
			   }
			   
			   WebElement titledropdown = xp("XTITLE");
			   Select titleselect = new Select(titledropdown);
			   List<WebElement> titleoptions = titleselect.getOptions();
			   Actions titleactions = new Actions(driver);
			   for(int i=0;i<titleoptions.size();i++) {
					 titleactions.moveToElement(titledropdown).perform();
					 titleselect.selectByIndex(i);
				   }
			   
			   WebElement identitydropdown = xp("XIDENTITY");
			   Select identityselect = new Select(identitydropdown);
			   List<WebElement> identityoptions = identityselect.getOptions();
			   Actions indentityactions = new Actions(driver);
			   for(int i=0;i<identityoptions.size();i++) {
					 indentityactions.moveToElement(identitydropdown).perform();
					identityselect.selectByIndex(i);
				   }
			   
			   WebElement nationalitydropdown = xp("XNATIONALITY");
			   Select nationalityselect  = new Select(nationalitydropdown);
			   List<WebElement> nationalityoptions = nationalityselect.getOptions();
			   Actions nationalityactions = new Actions(driver);
			   for(int i=0;i<nationalityoptions.size();i++) {
				   nationalityactions.moveToElement(nationalitydropdown).perform();
				   nationalityselect.selectByIndex(i);
			   }
			   
			   WebElement vipdropdown = xp("XVIP");
			   Select vipselect  = new Select(vipdropdown);
			   List<WebElement> vipoptions = vipselect.getOptions();
			   Actions vipactions = new Actions(driver);
			   for(int i=0;i<vipoptions.size();i++) {
				   vipactions.moveToElement(vipdropdown).perform();
				   vipselect.selectByIndex(i);
			   }
			   
			   WebElement educationdropdown = xp("XEDUCATION");
			   Select educationselect  = new Select(educationdropdown);
			   List<WebElement> educationoptions = educationselect.getOptions();
			   Actions educationactions = new Actions(driver);
			   for(int i=0;i<educationoptions.size();i++) {
				   vipactions.moveToElement(educationdropdown).perform();
				   educationselect.selectByIndex(i);
			   }
			   
			   WebElement occupationdropdown = xp("XOCCUPATION");
			   Select occupationselect  = new Select(occupationdropdown);
			   List<WebElement> occupationoptions = occupationselect.getOptions();
			   Actions occupationactions = new Actions(driver);
			   for(int i=0;i<occupationoptions.size();i++) {
				   occupationactions.moveToElement(occupationdropdown).perform();
				   occupationselect.selectByIndex(i);
			   }
			   
			   WebElement bloodgroupdropdown = xp("XBLOODGROUP");
			   Select bloodgroupselect  = new Select(bloodgroupdropdown);
			   List<WebElement> bloodgroupoptions = bloodgroupselect.getOptions();
			   Actions bloodgroupactions = new Actions(driver);
			   for(int i=0;i<bloodgroupoptions.size();i++) {
				   bloodgroupactions.moveToElement(bloodgroupdropdown).perform();
				   bloodgroupselect.selectByIndex(i);
			   }
			   
			   WebElement citizenshipdropdown = xp("XCITIZENSHIP");
			   Select citizenshipselect  = new Select(citizenshipdropdown);
			   List<WebElement> citizenshipoptions = citizenshipselect.getOptions();
			   Actions citizenshipactions = new Actions(driver);
			   for(int i=0;i<citizenshipoptions.size();i++) {
				  citizenshipactions.moveToElement(citizenshipdropdown).perform();
				   citizenshipselect.selectByIndex(i);
			   }
			   
			   WebElement seniorcitizendropdown = xp("XSENIORCITIZENPROOF");
			   Select seniorcitizenselect  = new Select(seniorcitizendropdown);
			   List<WebElement> seniorcitizenoptions = seniorcitizenselect.getOptions();
			   Actions seniorcitizenactions = new Actions(driver);
			   for(int i=0;i<seniorcitizenoptions.size();i++) {
				  seniorcitizenactions.moveToElement(seniorcitizendropdown).perform();
				   seniorcitizenselect.selectByIndex(i);
			   }
			   
			   WebElement genderdropdown = xp("XGENDER");
			   Select genderselect  = new Select(genderdropdown);
			   List<WebElement> genderoptions = genderselect.getOptions();
			   Actions genderactions = new Actions(driver);
			   for(int i=0;i<genderoptions.size();i++) {
				  genderactions.moveToElement(genderdropdown).perform();
				   genderselect.selectByIndex(i);
			   }
			   
			   WebElement maritalstatusdropdown = xp("XMARITALSTATUS");
			   Select maritalstatusselect  = new Select(maritalstatusdropdown);
			   List<WebElement> maritalstatusoptions = maritalstatusselect.getOptions();
			   Actions maritalstatusactions = new Actions(driver);
			   for(int i=0;i<maritalstatusoptions.size();i++) {
				  maritalstatusactions.moveToElement(maritalstatusdropdown).perform();
				   maritalstatusselect.selectByIndex(i);
			   }
			   
			   WebElement religiondropdown = xp("XRELIGION");
			   Select religionselect  = new Select(religiondropdown);
			   List<WebElement> religionoptions = religionselect.getOptions();
			   Actions religionactions = new Actions(driver);
			   for(int i=0;i<religionoptions.size();i++) {
				  religionactions.moveToElement(religiondropdown).perform();
				   religionselect.selectByIndex(1);
			   }
			   
			   WebElement primarylanguagedropdown = xp("XPRIMARYLANGUAGE");
			   Select primarylanguageselect  = new Select(primarylanguagedropdown);
			   List<WebElement> primarylanguageoptions = primarylanguageselect.getOptions();
			   Actions primarylanguageactions = new Actions(driver);
			   for(int i=0;i<primarylanguageoptions.size();i++) {
				  primarylanguageactions.moveToElement(primarylanguagedropdown).perform();
				   primarylanguageselect.selectByIndex(1);
			   }
			   
			   WebElement countrydropdown = xp("XCOUNTRY");
			   Select countryselect  = new Select(countrydropdown);
			   List<WebElement> countryoptions = countryselect.getOptions();
			   Actions countryactions = new Actions(driver);
			   for(int i=0;i<countryoptions.size();i++) {
				  countryactions.moveToElement(countrydropdown).perform();
				   countryselect.selectByIndex(1);
			   }
			   
			
			WebElement dobicon = xp("XDOB");
			dobicon.click();
		dobicon.sendKeys("12-08-2025");
		
			
         
        
			   
			   Actions image = new Actions(driver);
			   image.moveToElement(xp("XIMAGE")).click().perform();
			   StringSelection S = new StringSelection("C:\\Users\\Vishal\\Downloads\\Testing Tools\\Manual Testing\\Agile.jpg");
			   
			   t(2);
			   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(S, null);
			   
			   t(3);
			   
			   Robot R = new Robot();
			   t(1);
			   R.keyPress(KeyEvent.VK_CONTROL);
			   R.keyPress(KeyEvent.VK_V);
			   R.keyRelease(KeyEvent.VK_CONTROL);
			   R.keyRelease(KeyEvent.VK_V);
			   R.keyPress(KeyEvent.VK_ENTER);
			   R.keyRelease(KeyEvent.VK_ENTER);
			   
			   t(3);
			     
		  xp("XSAVE").click();
		  t(5);
		  
 	 Alert A = driver.switchTo().alert();
	 t(3);
	  A.accept();
		  
		 // xp("XCLEAR").click();
		  
  }
  
  public void addpatientexcel() throws IOException, InterruptedException, AWTException {
	  
		FileInputStream fis = new FileInputStream("C:\\Users\\Vishal\\Automation Testing\\Framework_KosmikHMS\\src\\data\\java\\KosmikHMS.xlsx");
		XSSFWorkbook w = new XSSFWorkbook(fis);
		XSSFSheet sht = w.getSheet("ADDPATIENTS");
		
		// DataFormatter to handle both numeric and string cells
		DataFormatter formatter = new DataFormatter();

		String patientid  = formatter.formatCellValue(sht.getRow(1).getCell(0));
		String patientCategory = formatter.formatCellValue(sht.getRow(1).getCell(1));
		String title = formatter.formatCellValue(sht.getRow(1).getCell(2));
		String firstname = formatter.formatCellValue(sht.getRow(1).getCell(3));
		String lastname = formatter.formatCellValue(sht.getRow(1).getCell(4));
		String dob = formatter.formatCellValue(sht.getRow(1).getCell(5));
		String age = formatter.formatCellValue(sht.getRow(1).getCell(6));
		String gender = formatter.formatCellValue(sht.getRow(1).getCell(7));
		String maritalStatus = formatter.formatCellValue(sht.getRow(1).getCell(8));
		String religion = formatter.formatCellValue(sht.getRow(1).getCell(9));
		String primaryLanguage = formatter.formatCellValue(sht.getRow(1).getCell(10));
		String relation = formatter.formatCellValue(sht.getRow(1).getCell(11));
		String patientIdentifier = formatter.formatCellValue(sht.getRow(1).getCell(12));
		String idProof = formatter.formatCellValue(sht.getRow(1).getCell(13));
		String nationality = formatter.formatCellValue(sht.getRow(1).getCell(14));
		String vip = formatter.formatCellValue(sht.getRow(1).getCell(15));
		String education = formatter.formatCellValue(sht.getRow(1).getCell(16));
		String occupation = formatter.formatCellValue(sht.getRow(1).getCell(17));
		String bloodGroup = formatter.formatCellValue(sht.getRow(1).getCell(18));
		String citizenship = formatter.formatCellValue(sht.getRow(1).getCell(19));
		String seniorCitizenProof = formatter.formatCellValue(sht.getRow(1).getCell(20));
		String address1 = formatter.formatCellValue(sht.getRow(1).getCell(21));
		String phone = formatter.formatCellValue(sht.getRow(1).getCell(22));
		String country = formatter.formatCellValue(sht.getRow(1).getCell(23));
		String pin = formatter.formatCellValue(sht.getRow(1).getCell(24));
	      

		
		
		
		  t(1);
		   xp("XREG").click();
		  
			  
			  xp("XFIRSTNAME").sendKeys(firstname);
		//	  xp("XMIDDLENAME").sendKeys("anthony");
			  xp("XLASTNAME").sendKeys(lastname);
			  xp("XAGE").sendKeys(age);
		//	  xp("XMOTHERNAME").sendKeys("elizabeth hastwood");
			  xp("XIDPROOF").sendKeys(idProof);
		//	  xp("XADDRESS").sendKeys("hyderabad");
			  xp("XMOBILENUMBER").sendKeys(phone);
			  xp("XADDRESS1").sendKeys(address1);
		//	  xp("XADDRESS2").sendKeys("kukatpally");
			  xp("XZIP").sendKeys(pin);
		//	  xp("XEMAIL").sendKeys("john123@wwe.com");
			  
			 WebElement patientdropdown =xp("XPATIENT");
				   Select patientselect = new Select(patientdropdown);
				   List<WebElement> patientoptions = patientselect.getOptions();
				   Actions patientactions = new Actions(driver);
				   for(int i=0;i<patientoptions.size();i++) {
					  patientactions.moveToElement(patientdropdown).perform();
					  patientselect.selectByIndex(i);
				   }
				   
				   WebElement relationdropdown = xp("XRELATION");
				   Select relationselect = new Select(relationdropdown);
				   List<WebElement> relationoptions = relationselect.getOptions();
				   Actions relationactions = new Actions(driver);
				   for(int i=0;i<relationoptions.size();i++) {
					 relationactions.moveToElement(relationdropdown).perform();
					 relationselect.selectByIndex(i);
				   }
				   
				   WebElement titledropdown = xp("XTITLE");
				   Select titleselect = new Select(titledropdown);
				   List<WebElement> titleoptions = titleselect.getOptions();
				   Actions titleactions = new Actions(driver);
				   for(int i=0;i<titleoptions.size();i++) {
						 titleactions.moveToElement(titledropdown).perform();
						 titleselect.selectByIndex(i);
					   }
				   
				   WebElement identitydropdown = xp("XIDENTITY");
				   Select identityselect = new Select(identitydropdown);
				   List<WebElement> identityoptions = identityselect.getOptions();
				   Actions indentityactions = new Actions(driver);
				   for(int i=0;i<identityoptions.size();i++) {
						 indentityactions.moveToElement(identitydropdown).perform();
						identityselect.selectByIndex(i);
					   }
				   
				   WebElement nationalitydropdown = xp("XNATIONALITY");
				   Select nationalityselect  = new Select(nationalitydropdown);
				   List<WebElement> nationalityoptions = nationalityselect.getOptions();
				   Actions nationalityactions = new Actions(driver);
				   for(int i=0;i<nationalityoptions.size();i++) {
					   nationalityactions.moveToElement(nationalitydropdown).perform();
					   nationalityselect.selectByIndex(i);
				   }
				   
				   WebElement vipdropdown = xp("XVIP");
				   Select vipselect  = new Select(vipdropdown);
				   List<WebElement> vipoptions = vipselect.getOptions();
				   Actions vipactions = new Actions(driver);
				   for(int i=0;i<vipoptions.size();i++) {
					   vipactions.moveToElement(vipdropdown).perform();
					   vipselect.selectByIndex(i);
				   }
				   
				   WebElement educationdropdown = xp("XEDUCATION");
				   Select educationselect  = new Select(educationdropdown);
				   List<WebElement> educationoptions = educationselect.getOptions();
				   Actions educationactions = new Actions(driver);
				   for(int i=0;i<educationoptions.size();i++) {
					   vipactions.moveToElement(educationdropdown).perform();
					   educationselect.selectByIndex(i);
				   }
				   
				   WebElement occupationdropdown = xp("XOCCUPATION");
				   Select occupationselect  = new Select(occupationdropdown);
				   List<WebElement> occupationoptions = occupationselect.getOptions();
				   Actions occupationactions = new Actions(driver);
				   for(int i=0;i<occupationoptions.size();i++) {
					   occupationactions.moveToElement(occupationdropdown).perform();
					   occupationselect.selectByIndex(i);
				   }
				   
				   WebElement bloodgroupdropdown = xp("XBLOODGROUP");
				   Select bloodgroupselect  = new Select(bloodgroupdropdown);
				   List<WebElement> bloodgroupoptions = bloodgroupselect.getOptions();
				   Actions bloodgroupactions = new Actions(driver);
				   for(int i=0;i<bloodgroupoptions.size();i++) {
					   bloodgroupactions.moveToElement(bloodgroupdropdown).perform();
					   bloodgroupselect.selectByIndex(i);
				   }
				   
				   WebElement citizenshipdropdown = xp("XCITIZENSHIP");
				   Select citizenshipselect  = new Select(citizenshipdropdown);
				   List<WebElement> citizenshipoptions = citizenshipselect.getOptions();
				   Actions citizenshipactions = new Actions(driver);
				   for(int i=0;i<citizenshipoptions.size();i++) {
					  citizenshipactions.moveToElement(citizenshipdropdown).perform();
					   citizenshipselect.selectByIndex(i);
				   }
				   
				   WebElement seniorcitizendropdown = xp("XSENIORCITIZENPROOF");
				   Select seniorcitizenselect  = new Select(seniorcitizendropdown);
				   List<WebElement> seniorcitizenoptions = seniorcitizenselect.getOptions();
				   Actions seniorcitizenactions = new Actions(driver);
				   for(int i=0;i<seniorcitizenoptions.size();i++) {
					  seniorcitizenactions.moveToElement(seniorcitizendropdown).perform();
					   seniorcitizenselect.selectByIndex(i);
				   }
				   
				   WebElement genderdropdown = xp("XGENDER");
				   Select genderselect  = new Select(genderdropdown);
				   List<WebElement> genderoptions = genderselect.getOptions();
				   Actions genderactions = new Actions(driver);
				   for(int i=0;i<genderoptions.size();i++) {
					  genderactions.moveToElement(genderdropdown).perform();
					   genderselect.selectByIndex(i);
				   }
				   
				   WebElement maritalstatusdropdown = xp("XMARITALSTATUS");
				   Select maritalstatusselect  = new Select(maritalstatusdropdown);
				   List<WebElement> maritalstatusoptions = maritalstatusselect.getOptions();
				   Actions maritalstatusactions = new Actions(driver);
				   for(int i=0;i<maritalstatusoptions.size();i++) {
					  maritalstatusactions.moveToElement(maritalstatusdropdown).perform();
					   maritalstatusselect.selectByIndex(i);
				   }
				   
				   WebElement religiondropdown = xp("XRELIGION");
				   Select religionselect  = new Select(religiondropdown);
				   List<WebElement> religionoptions = religionselect.getOptions();
				   Actions religionactions = new Actions(driver);
				   for(int i=0;i<religionoptions.size();i++) {
					  religionactions.moveToElement(religiondropdown).perform();
					   religionselect.selectByIndex(1);
				   }
				   
				   WebElement primarylanguagedropdown = xp("XPRIMARYLANGUAGE");
				   Select primarylanguageselect  = new Select(primarylanguagedropdown);
				   List<WebElement> primarylanguageoptions = primarylanguageselect.getOptions();
				   Actions primarylanguageactions = new Actions(driver);
				   for(int i=0;i<primarylanguageoptions.size();i++) {
					  primarylanguageactions.moveToElement(primarylanguagedropdown).perform();
					   primarylanguageselect.selectByIndex(1);
				   }
				   
				   WebElement countrydropdown = xp("XCOUNTRY");
				   Select countryselect  = new Select(countrydropdown);
				   List<WebElement> countryoptions = countryselect.getOptions();
				   Actions countryactions = new Actions(driver);
				   for(int i=0;i<countryoptions.size();i++) {
					  countryactions.moveToElement(countrydropdown).perform();
					   countryselect.selectByIndex(1);
				   }
				   
				
				WebElement dobicon = xp("XDOB");
				dobicon.click();
			dobicon.sendKeys("12-08-2025");
			
				
	         
	        
				   
				   Actions image = new Actions(driver);
				   image.moveToElement(xp("XIMAGE")).click().perform();
				   StringSelection S = new StringSelection("C:\\Users\\Vishal\\Downloads\\Testing Tools\\Manual Testing\\Agile.jpg");
				   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(S, null);
				   
				   t(3);
				   
				   Robot R = new Robot();
				   t(1);
				   R.keyPress(KeyEvent.VK_CONTROL);
				   R.keyPress(KeyEvent.VK_V);
				   R.keyRelease(KeyEvent.VK_CONTROL);
				   R.keyRelease(KeyEvent.VK_V);
				   R.keyPress(KeyEvent.VK_ENTER);
				   R.keyRelease(KeyEvent.VK_ENTER);
				   
				   t(3);
				     
			  xp("XSAVE").click();
			  t(5);
			  
		 Alert A = driver.switchTo().alert();
		 t(3);
		 A.accept();
			  
			 // xp("XCLEAR").click();
		
		
	  
  }
  
  public void addpatientsexcel() throws InterruptedException, IOException, AWTException {
	  
	  FileInputStream fis = new FileInputStream("C:\\Users\\Vishal\\Automation Testing\\Framework_KosmikHMS\\src\\data\\java\\KosmikHMS.xlsx");
		XSSFWorkbook w = new XSSFWorkbook(fis);
		XSSFSheet sht = w.getSheet("ADDPATIENTS");
		
		
		for(int k=1;k<=sht.getLastRowNum();k++) {
		// DataFormatter to handle both numeric and string cells
		DataFormatter formatter = new DataFormatter();

		String patientid  = formatter.formatCellValue(sht.getRow(k).getCell(0));
		String patientCategory = formatter.formatCellValue(sht.getRow(k).getCell(1));
		String title = formatter.formatCellValue(sht.getRow(k).getCell(2));
		String firstname = formatter.formatCellValue(sht.getRow(k).getCell(3));
		String lastname = formatter.formatCellValue(sht.getRow(k).getCell(4));
		String dob = formatter.formatCellValue(sht.getRow(k).getCell(5));
		String age = formatter.formatCellValue(sht.getRow(k).getCell(6));
		String gender = formatter.formatCellValue(sht.getRow(k).getCell(7));
		String maritalStatus = formatter.formatCellValue(sht.getRow(k).getCell(8));
		String religion = formatter.formatCellValue(sht.getRow(k).getCell(9));
		String primaryLanguage = formatter.formatCellValue(sht.getRow(k).getCell(10));
		String relation = formatter.formatCellValue(sht.getRow(k).getCell(11));
		String patientIdentifier = formatter.formatCellValue(sht.getRow(k).getCell(12));
		String idProof = formatter.formatCellValue(sht.getRow(k).getCell(13));
		String nationality = formatter.formatCellValue(sht.getRow(k).getCell(14));
		String vip = formatter.formatCellValue(sht.getRow(k).getCell(15));
		String education = formatter.formatCellValue(sht.getRow(k).getCell(16));
		String occupation = formatter.formatCellValue(sht.getRow(k).getCell(17));
		String bloodGroup = formatter.formatCellValue(sht.getRow(k).getCell(18));
		String citizenship = formatter.formatCellValue(sht.getRow(k).getCell(19));
		String seniorCitizenProof = formatter.formatCellValue(sht.getRow(k).getCell(20));
		String address1 = formatter.formatCellValue(sht.getRow(k).getCell(21));
		String phone = formatter.formatCellValue(sht.getRow(k).getCell(22));
		String country = formatter.formatCellValue(sht.getRow(k).getCell(23));
		String pin = formatter.formatCellValue(sht.getRow(k).getCell(24));
	      

		
		
		
		  t(1);
		   xp("XREG").click();
		  
			  
			  xp("XFIRSTNAME").sendKeys(firstname);
		//	  xp("XMIDDLENAME").sendKeys("anthony");
			  xp("XLASTNAME").sendKeys(lastname);
			  xp("XAGE").sendKeys(age);
		//	  xp("XMOTHERNAME").sendKeys("elizabeth hastwood");
			  xp("XIDPROOF").sendKeys(idProof);
		//	  xp("XADDRESS").sendKeys("hyderabad");
			  xp("XMOBILENUMBER").sendKeys(phone);
			  xp("XADDRESS1").sendKeys(address1);
		//	  xp("XADDRESS2").sendKeys("kukatpally");
			  xp("XZIP").sendKeys(pin);
		//	  xp("XEMAIL").sendKeys("john123@wwe.com");
			  
			 WebElement patientdropdown =xp("XPATIENT");
				   Select patientselect = new Select(patientdropdown);
				   List<WebElement> patientoptions = patientselect.getOptions();
				   Actions patientactions = new Actions(driver);
				   for(int i=0;i<patientoptions.size();i++) {
					  patientactions.moveToElement(patientdropdown).perform();
					  patientselect.selectByIndex(i);
				   }
				   
				   WebElement relationdropdown = xp("XRELATION");
				   Select relationselect = new Select(relationdropdown);
				   List<WebElement> relationoptions = relationselect.getOptions();
				   Actions relationactions = new Actions(driver);
				   for(int i=0;i<relationoptions.size();i++) {
					 relationactions.moveToElement(relationdropdown).perform();
					 relationselect.selectByIndex(i);
				   }
				   
				   WebElement titledropdown = xp("XTITLE");
				   Select titleselect = new Select(titledropdown);
				   List<WebElement> titleoptions = titleselect.getOptions();
				   Actions titleactions = new Actions(driver);
				   for(int i=0;i<titleoptions.size();i++) {
						 titleactions.moveToElement(titledropdown).perform();
						 titleselect.selectByIndex(i);
					   }
				   
				   WebElement identitydropdown = xp("XIDENTITY");
				   Select identityselect = new Select(identitydropdown);
				   List<WebElement> identityoptions = identityselect.getOptions();
				   Actions indentityactions = new Actions(driver);
				   for(int i=0;i<identityoptions.size();i++) {
						 indentityactions.moveToElement(identitydropdown).perform();
						identityselect.selectByIndex(i);
					   }
				   
				   WebElement nationalitydropdown = xp("XNATIONALITY");
				   Select nationalityselect  = new Select(nationalitydropdown);
				   List<WebElement> nationalityoptions = nationalityselect.getOptions();
				   Actions nationalityactions = new Actions(driver);
				   for(int i=0;i<nationalityoptions.size();i++) {
					   nationalityactions.moveToElement(nationalitydropdown).perform();
					   nationalityselect.selectByIndex(i);
				   }
				   
				   WebElement vipdropdown = xp("XVIP");
				   Select vipselect  = new Select(vipdropdown);
				   List<WebElement> vipoptions = vipselect.getOptions();
				   Actions vipactions = new Actions(driver);
				   for(int i=0;i<vipoptions.size();i++) {
					   vipactions.moveToElement(vipdropdown).perform();
					   vipselect.selectByIndex(i);
				   }
				   
				   WebElement educationdropdown = xp("XEDUCATION");
				   Select educationselect  = new Select(educationdropdown);
				   List<WebElement> educationoptions = educationselect.getOptions();
				   Actions educationactions = new Actions(driver);
				   for(int i=0;i<educationoptions.size();i++) {
					   vipactions.moveToElement(educationdropdown).perform();
					   educationselect.selectByIndex(i);
				   }
				   
				   WebElement occupationdropdown = xp("XOCCUPATION");
				   Select occupationselect  = new Select(occupationdropdown);
				   List<WebElement> occupationoptions = occupationselect.getOptions();
				   Actions occupationactions = new Actions(driver);
				   for(int i=0;i<occupationoptions.size();i++) {
					   occupationactions.moveToElement(occupationdropdown).perform();
					   occupationselect.selectByIndex(i);
				   }
				   
				   WebElement bloodgroupdropdown = xp("XBLOODGROUP");
				   Select bloodgroupselect  = new Select(bloodgroupdropdown);
				   List<WebElement> bloodgroupoptions = bloodgroupselect.getOptions();
				   Actions bloodgroupactions = new Actions(driver);
				   for(int i=0;i<bloodgroupoptions.size();i++) {
					   bloodgroupactions.moveToElement(bloodgroupdropdown).perform();
					   bloodgroupselect.selectByIndex(i);
				   }
				   
				   WebElement citizenshipdropdown = xp("XCITIZENSHIP");
				   Select citizenshipselect  = new Select(citizenshipdropdown);
				   List<WebElement> citizenshipoptions = citizenshipselect.getOptions();
				   Actions citizenshipactions = new Actions(driver);
				   for(int i=0;i<citizenshipoptions.size();i++) {
					  citizenshipactions.moveToElement(citizenshipdropdown).perform();
					   citizenshipselect.selectByIndex(i);
				   }
				   
				   WebElement seniorcitizendropdown = xp("XSENIORCITIZENPROOF");
				   Select seniorcitizenselect  = new Select(seniorcitizendropdown);
				   List<WebElement> seniorcitizenoptions = seniorcitizenselect.getOptions();
				   Actions seniorcitizenactions = new Actions(driver);
				   for(int i=0;i<seniorcitizenoptions.size();i++) {
					  seniorcitizenactions.moveToElement(seniorcitizendropdown).perform();
					   seniorcitizenselect.selectByIndex(i);
				   }
				   
				   WebElement genderdropdown = xp("XGENDER");
				   Select genderselect  = new Select(genderdropdown);
				   List<WebElement> genderoptions = genderselect.getOptions();
				   Actions genderactions = new Actions(driver);
				   for(int i=0;i<genderoptions.size();i++) {
					  genderactions.moveToElement(genderdropdown).perform();
					   genderselect.selectByIndex(i);
				   }
				   
				   WebElement maritalstatusdropdown = xp("XMARITALSTATUS");
				   Select maritalstatusselect  = new Select(maritalstatusdropdown);
				   List<WebElement> maritalstatusoptions = maritalstatusselect.getOptions();
				   Actions maritalstatusactions = new Actions(driver);
				   for(int i=0;i<maritalstatusoptions.size();i++) {
					  maritalstatusactions.moveToElement(maritalstatusdropdown).perform();
					   maritalstatusselect.selectByIndex(i);
				   }
				   
				   WebElement religiondropdown = xp("XRELIGION");
				   Select religionselect  = new Select(religiondropdown);
				   List<WebElement> religionoptions = religionselect.getOptions();
				   Actions religionactions = new Actions(driver);
				   for(int i=0;i<religionoptions.size();i++) {
					  religionactions.moveToElement(religiondropdown).perform();
					   religionselect.selectByIndex(1);
				   }
				   
				   WebElement primarylanguagedropdown = xp("XPRIMARYLANGUAGE");
				   Select primarylanguageselect  = new Select(primarylanguagedropdown);
				   List<WebElement> primarylanguageoptions = primarylanguageselect.getOptions();
				   Actions primarylanguageactions = new Actions(driver);
				   for(int i=0;i<primarylanguageoptions.size();i++) {
					  primarylanguageactions.moveToElement(primarylanguagedropdown).perform();
					   primarylanguageselect.selectByIndex(1);
				   }
				   
				   WebElement countrydropdown = xp("XCOUNTRY");
				   Select countryselect  = new Select(countrydropdown);
				   List<WebElement> countryoptions = countryselect.getOptions();
				   Actions countryactions = new Actions(driver);
				   for(int i=0;i<countryoptions.size();i++) {
					  countryactions.moveToElement(countrydropdown).perform();
					   countryselect.selectByIndex(1);
				   }
				   
				
				WebElement dobicon = xp("XDOB");
				dobicon.click();
			dobicon.sendKeys("12-08-2025");
			
				
	         
	        
				   
				   Actions image = new Actions(driver);
				   image.moveToElement(xp("XIMAGE")).click().perform();
				   StringSelection S = new StringSelection("C:\\Users\\Vishal\\Downloads\\Testing Tools\\Manual Testing\\Agile.jpg");
				   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(S, null);
				   

					
					
				   
				   t(3);
				   
				   Robot R = new Robot();
				   t(1);
				   R.keyPress(KeyEvent.VK_CONTROL);
				   R.keyPress(KeyEvent.VK_V);
				   R.keyRelease(KeyEvent.VK_CONTROL);
				   R.keyRelease(KeyEvent.VK_V);
				   R.keyPress(KeyEvent.VK_ENTER);
				   R.keyRelease(KeyEvent.VK_ENTER);
				   
				   t(3);
				  
			  xp("XSAVE").click();
				
			//  t(5);
			  
		 Alert A = driver.switchTo().alert();
		 t(3);
		 A.accept();
			  
		 
			 // xp("XCLEAR").click();
		
		}
	  
  }
  
  public void editpatient() throws InterruptedException {
	  t(3);
	  xp("XREG").click();
	  t(3);
	  xp("XSEARCHREGISTRATION").click();
	  t(3);
	  xp("XEDIT").click();  
	  
	  xp("XFIRSTNAME").clear();
	  xp("XFIRSTNAME").sendKeys("gerard");
	  
	  xp("XAGE").clear();
	  xp("XAGE").sendKeys("35");
	  
	  xp("XEMAIL").clear();
	  xp("XEMAIL").sendKeys("gerarrd123@hotmail.com");
	  
	  xp("XADDRESS").clear();
	  xp("XADDRESS").sendKeys("boston,usa");
	  
	  t(5);
	  
	  
	  WebElement patientupdate = xp("XPATIENTUPDATE");
	  Select patientselect = new Select(patientupdate);
	  patientselect.selectByVisibleText("Insurance");
	  t(5);
	  WebElement titleupdate = xp("XTITLEUPDATE");
	  Select titleselect = new Select(titleupdate);
	  titleselect.selectByVisibleText("Mr.");
	  t(5);
	  WebElement genderupdate = xp("XGENDERUPDATE");
	  Select genderselect = new Select(genderupdate);
	  genderselect.selectByVisibleText("Female");
	  t(5);
	  WebElement religionupdate = xp("XRELIGIONUPDATE");
	  Select religionselect = new Select(religionupdate);
	  religionselect.selectByVisibleText("Hindu");
	  t(5);
	  WebElement primarylanguageupdate = xp("XPRIMARYLANGUAGEUPDATE");
	  Select primarylanguageselect = new Select(primarylanguageupdate);
	  primarylanguageselect.selectByVisibleText("Telugu");
	  t(5);
	  WebElement countryupdate = xp("XCOUNTRYUPDATE");
	  Select countryupdateselect = new Select(countryupdate);
	  countryupdateselect.selectByVisibleText("India");
	  t(5);
	  WebElement relationupdate = xp("XRELATIONUPDATE");
	  Select relationupdateselect = new Select(relationupdate);
	  relationupdateselect.selectByVisibleText("Father");
	  t(5);
	  WebElement patientidentifierupdate = xp("XPATIENTIDENTIFIERUPDATE");
	  Select patientidentifierupdateselect = new Select(patientidentifierupdate);
	  patientidentifierupdateselect.selectByVisibleText("AAdhar Card");
	  t(5);
	  WebElement nationalityupdate = xp("XNATIONALITYUPDATE");
	  Select nationalityupdateselect = new Select(nationalityupdate);
	  nationalityupdateselect.selectByVisibleText("Indian");
	  t(5);
	  
	  WebElement vipupdate = xp("XVIPUPDATE");
	  Select vipupdateselect = new Select(vipupdate);
	  vipupdateselect.selectByVisibleText("Yes");
	  t(5);
	  WebElement educationupdate = xp("XEDUCATIONUPDATE");
	  Select educationupdateselect = new Select(educationupdate);
	  educationupdateselect.selectByVisibleText("B.Tech");
	  t(5);
	  WebElement occupationupdate = xp("XOCCUPATIONUPDATE");
	  Select occupationupdateselect = new Select(occupationupdate);
	  occupationupdateselect.selectByVisibleText("Self Employeed");
	  t(5);
	  WebElement maritialstatusupdate = xp("XMARITIALSTATUSUPDATE");
	  Select maritialupdateselect = new Select(maritialstatusupdate);
	  maritialupdateselect.selectByVisibleText("Single");
	  t(5);
	  WebElement bloodgroupupdate = xp("XBLOODGROUPUPDATE");
	  Select bloodgroupupdateselect = new Select(bloodgroupupdate);
	  bloodgroupupdateselect.selectByVisibleText("O+");
	  t(5);
	  WebElement citizenshipupdate = xp("XCITIZENSHIPUPDATE");
	  Select citizenshipupdateselect = new Select(citizenshipupdate);
	  citizenshipupdateselect.selectByVisibleText("Indian");
	  t(5);
	  WebElement seniorcitizenproofupdate = xp("XSENIORCITIZENPROOFUPDATE");
	  Select seniorcitizenproofupdateselect = new Select(seniorcitizenproofupdate);
	  seniorcitizenproofupdateselect.selectByVisibleText("No");
	  
	  t(5);
	  
	  
	  xp("XUPDATE").click();
	  t(5);
	//  Alert D= driver.switchTo().alert();
	//	 t(5);
	//	 D.accept();
	  }
  
  
  public void deletepatient() throws InterruptedException {
	  t(3);
	  xp("XREG").click();
	  t(2);
	  xp("XSEARCHREGISTRATION").click();
	  t(5);
	  xp("XCANCEL").click();
	  t(5);
	  
	  Alert D= driver.switchTo().alert();
	t(5);
 D.accept();
  }

  public void deletepatients() throws InterruptedException {
	    // Step 1: Go to Search Registration
	  t(3);
	  xp("XREG").click();
	    t(2);
	    xp("XSEARCHREGISTRATION").click();
	    t(5);

	    // Step 2: Keep deleting until no Cancel buttons are left
	    while (true) {
	        // Find all Cancel links fresh every time
	        List<WebElement> cancelButtons = driver.findElements(By.xpath("//a[text()='Cancel']"));

	        // Stop if no Cancel links found
	        if (cancelButtons.isEmpty()) {
	            System.out.println("✅ All patients deleted successfully!");
	            break;
	        }

	        // Always click the first Cancel button in the table
	        cancelButtons.get(0).click();
	        t(2);

	        // Step 3: Handle alert confirmation
	        try {
	            Alert alert = driver.switchTo().alert();
	            alert.accept();   // Click OK
	            System.out.println("🗑 Deleted one patient");
	        } catch (NoAlertPresentException e) {
	            System.out.println("⚠️ No alert appeared after clicking Cancel");
	        }

	        // Step 4: Small wait for table reload
	        t(3);
	    }
	}

public void logout() throws InterruptedException {
	t(15);
	xp("XLOGOUT").click();
	
}



  
  
  
}
