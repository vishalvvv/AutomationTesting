package ParallelPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelApp {
	
	public static WebDriver driver;
	
  @Test
  public void Google() {
	  
	  System.out.println("The track/thread on google is : " + Thread.currentThread().getId());
	   
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		  	 driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.google.com/");
  }
  
  @Test
  public void OrangeHRM() {
	  
	  
	  System.out.println("The track/thread on OrangeHRM is : " + Thread.currentThread().getId());
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	   driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");

		driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@tabindex = '2']")).sendKeys("cypress");
		driver.findElement(By.xpath("//input[@value = 'Login']")).click();
		
	
		
	  
  }
  
}
