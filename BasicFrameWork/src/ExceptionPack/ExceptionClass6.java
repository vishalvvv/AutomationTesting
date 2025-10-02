package ExceptionPack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExceptionClass6 {
  @Test
  public void data() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  WebDriver	 driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		try {
			FileInputStream west = new FileInputStream("");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@tabindex='2']")).sendKeys("cypress");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
  }
}
