package JavascriptExecutorPack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JSEClass2 {
	
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Vishal\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.ebay.com/");
	  
	  Thread.sleep(5000);
	  
	
	  
	  ((JavascriptExecutor)driver).executeScript("window.scroll(0,2300)");
	  
	  Thread.sleep(5000);
	  
	  driver.findElement(By.linkText("Diversity & Inclusion")).click();
	  
  }
}
