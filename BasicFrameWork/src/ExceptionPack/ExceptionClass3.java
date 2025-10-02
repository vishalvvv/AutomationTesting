package ExceptionPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExceptionClass3 {
  @Test
  public void data() {
	  int a =0;
	  int b = 11;
	  int c = 121;
	  
	  
	  
	  try {
	  System.out.println("The Division of B and A is :" +(b/a));
	  }
	  catch(Exception e) {
		  System.out.println("Invalid when we divide with ZERO");
	  }
	  
	  
	  System.out.println("The Division of C and B is :" +(c/b));
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  WebDriver	 driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@tabindex='2']")).sendKeys("cypress");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
  }
}
