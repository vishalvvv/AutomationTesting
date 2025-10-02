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

@Test
public class MyScreenshotClass1 {
	
  public void imageplease() throws InterruptedException, IOException {
	  
	   
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		  WebDriver	 driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
			
			
			// screenshot1
			
			File S1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File T1 = new File("C:\\Users\\Vishal\\Downloads\\Testing Tools\\Automation Testing\\basic Framework\\MyHomePage.jpg");
			FileHandler.copy(S1, T1);
			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
			driver.findElement(By.xpath("//input[@tabindex='2']")).sendKeys("cypress");
			
			// screenshot2
			File S2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File T2 = new File("C:\\Users\\Vishal\\Downloads\\Testing Tools\\Automation Testing\\basic Framework\\UsernamePassword.jpg");
			FileHandler.copy(S2, T2);
			
			driver.findElement(By.xpath("//input[@value='Login']")).click();
			
			Thread.sleep(2000);
			
			// screenshot3
			
			File S3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File T3 = new File("C:\\Users\\Vishal\\Downloads\\Testing Tools\\Automation Testing\\basic Framework\\AfterLogin.jpg");
			FileHandler.copy(S3, T3);
			
	  
  }
}
