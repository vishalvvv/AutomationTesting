package AdvanceXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrClass1 {
	
	public static WebDriver driver;
  @Test
  public void xpath() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		driver.findElement(By.xpath("//input[@class= 'Hello' or @type='text']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@class= 'Running' or @type= 'password']")).sendKeys("cypress");
		driver.findElement(By.xpath("//input[starts-with(@name , 'S')]")).click();
		
		System.out.println(driver.findElement(By.xpath("//li[text() = 'Welcome selenium']")).getText());
  
  }
}
