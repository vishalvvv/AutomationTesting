package JavascriptExecutorPack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JSEClass5 {
	
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  WebDriver	 driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		
		Thread.sleep(2000);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].value='selenium'", driver.findElement(By.xpath("//input[@type='text']")));
		
		Thread.sleep(2000);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].value='cypress'", driver.findElement(By.xpath("//input[@tabindex='2']")));
		
		Thread.sleep(2000);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",driver.findElement(By.xpath("//input[@value='Login']")));
  }
}
