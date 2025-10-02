package ScreenShotsPack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;


public class MyScreenshotClass3 {
	
	
	public static WebDriver	driver;
	
	@Test
  public void imageplease() throws InterruptedException, IOException {
	  
	   
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		  	 driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
			 
			ss("HomePage");
			
			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
			driver.findElement(By.xpath("//input[@tabindex='2']")).sendKeys("cypress");
			Thread.sleep(4000);
			ss("UsernamePassword");
			
			driver.findElement(By.xpath("//input[@value='Login']")).click();
			
			Thread.sleep(2000);
			
			ss("Afterlogin");
			   	  
  }
  
  public void ss(String u) throws IOException {
	  
		File S3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File T3 = new File("C:\\Users\\Vishal\\Downloads\\Testing Tools\\Automation Testing\\basic Framework\\" +u +".jpg");
		FileHandler.copy(S3, T3);
  }
  
  
}
