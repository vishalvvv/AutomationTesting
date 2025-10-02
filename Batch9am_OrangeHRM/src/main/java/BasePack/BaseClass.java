package BasePack;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
        public static WebDriver driver;
        
        public static Properties obj;
        
	  @BeforeClass
	  public void openingmybrowser() throws IOException {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Automation Testing\\Batch9am_OrangeHRM\\MyBro\\chromedriver.exe");
		   driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  FileInputStream f = new FileInputStream("C:\\Users\\Vishal\\Automation Testing\\Batch9am_OrangeHRM\\src\\data\\java\\MyDataPack\\DataFile");
		  
		   obj = new Properties();
		  obj.load(f);
		  
		//  System.out.println(P.getProperty("R"));
	  }
	  
	  
   @AfterMethod
  public void closingmybrowser() {
	  
	  driver.quit();
  }


}
