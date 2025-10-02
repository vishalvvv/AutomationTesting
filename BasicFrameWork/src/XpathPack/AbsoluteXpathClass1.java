package XpathPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AbsoluteXpathClass1 {

	public static WebDriver driver;
	 @BeforeClass
	  public void launchbrowser() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
	  }

 @Test
  public void Titleafterlogin() {
	   driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/input")).sendKeys("selenium");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/table/tbody/tr/td[2]/table/tbody/tr[3]/td[2]/input")).sendKeys("cypress");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td[1]/input")).click();
 }
// @AfterMethod
// public void closebrowser() {
//	  driver.quit();
// }

	
}
