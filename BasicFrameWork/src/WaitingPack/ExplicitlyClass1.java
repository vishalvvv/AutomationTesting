package WaitingPack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitlyClass1 {
	
	public static WebDriver driver;
  @Test
  public void f() {

	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Vishal\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe"); 
	   driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
	  driver.findElement(By.xpath("//input[@tabindex='2']")).sendKeys("cypress");
	  
	  WebElement L = new WebDriverWait(driver,Duration.ofSeconds(17)).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value ='Login']")));
	  
	  L.click();
  }
}
