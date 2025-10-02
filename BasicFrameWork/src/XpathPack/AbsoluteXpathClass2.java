package XpathPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AbsoluteXpathClass2 {

	public static WebDriver driver;
	 @BeforeClass
	  public void launchbrowser() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.findElement(By.xpath("/html/body/div[2]/div[4]/form/div/div/div/div/div[2]/textarea"));
	  }

 

	
}
