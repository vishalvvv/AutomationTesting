package DataProviderPack;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Dataproviderapplication {
	
  @Test(dataProvider = "NoRain")
  public void TestCase(String n, String s) {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  WebDriver	 driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(n);
		driver.findElement(By.xpath("//input[@tabindex='2']")).sendKeys(s);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	  
  }

  @DataProvider (name="NoRain")
  public String[][] mydata(){
	  String[][] A = new String[2][2];
	  
	  A[0][0] = "selenium";
	  A[0][1] = "cypress";
	  A[1][0] = "cold";
	  A[1][1] = "hot";
	  
	  return A;
	  
  }
}
