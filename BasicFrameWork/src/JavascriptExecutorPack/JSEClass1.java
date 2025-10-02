package JavascriptExecutorPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JSEClass1 {
	
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Vishal\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.amazon.in/");
	  
	  Thread.sleep(5000);
	  
	  driver.findElement(By.linkText("Fulfilment by Amazon")).click();  
	  
	  
  }
}
