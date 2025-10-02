package BasePack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

public class BaseClass {
	
	public static WebDriver driver;
	
	@BeforeMethod
	  public void openthebrowser() {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Vishal\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		 driver = new EdgeDriver();
		driver.manage().window().maximize();
		
	    
	  }


  
  @AfterClass
  public void closemybrowser() {
	  driver.quit();
  }

}
