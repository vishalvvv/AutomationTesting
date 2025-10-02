package AdvanceXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AncestorsClass1 {
	
	public static  WebDriver driver;
	
  @Test
  public void xpath() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  	 driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		driver.findElement(By.xpath("//input[@tabindex = '2']//preceding::input[1]")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@type = 'text']//following::input[1]")).sendKeys("cypress");
		driver.findElement(By.xpath("//input[@type = 'text']//following::input[2]")).click();
  }
  
}
