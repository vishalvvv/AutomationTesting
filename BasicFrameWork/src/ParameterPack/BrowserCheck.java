package ParameterPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserCheck {
	
	public static WebDriver driver;
	
	@Parameters({"mybro","UN","PWD","XSUB"})
  @Test
  public void OpeningMyBro(String mybro,String UN,String PWD,String XSUB) {
	  if(mybro.equals("Ee"))
	  {
	  System.setProperty("webdriver.edge.driver","C:\\Users\\Vishal\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	  driver = new EdgeDriver();
	  driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");

		driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys(UN);
		driver.findElement(By.xpath("//input[@tabindex = '2']")).sendKeys(PWD);
		driver.findElement(By.xpath(XSUB)).click();
		
	  }
		if(mybro.equals("Ch")) 
		{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		   driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");

			driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys(UN);
			driver.findElement(By.xpath("//input[@tabindex = '2']")).sendKeys(PWD);
			driver.findElement(By.xpath(XSUB)).click();
			
	  
		}
  }
  }

