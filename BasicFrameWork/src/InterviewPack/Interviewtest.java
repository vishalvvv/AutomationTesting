package InterviewPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Interviewtest {
	
	public static WebDriver driver;
  @Test
  public void firefox() throws IOException, InterruptedException {
	  System.setProperty("webdriver.firefox.driver","‪C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
     driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("vishal");
		driver.findElement(By.id("last-name")).sendKeys("vallala");
		driver.findElement(By.id("postal-code")).sendKeys("500072");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("finish")).click();
		Thread.sleep(3000);
		File S1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File T1 = new File("C:\\Users\\Vishal\\Downloads\\Testing Tools\\Automation Testing\\basic Framework\\Success.jpg");
		FileHandler.copy(S1, T1);
		
  }
  @Test
  public void edge() throws InterruptedException, IOException {
	  System.setProperty("webdriver.edge.driver","C:\\Users\\Vishal\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		 driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
		
		driver.findElement(By.name("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		driver.findElement(By.name("add-to-cart-sauce-labs-bike-light")).click();
	
		Thread.sleep(3000);
	
	
		
		  ((JavascriptExecutor)driver).executeScript("window.scroll(0,2300)");
		driver.findElement(By.name("add-to-cart-sauce-labs-onesie")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("vishal");
		driver.findElement(By.id("last-name")).sendKeys("vallala");
		driver.findElement(By.id("postal-code")).sendKeys("500072");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("finish")).click();
		Thread.sleep(3000);
		File S1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File T1 = new File("C:\\Users\\Vishal\\Downloads\\Testing Tools\\Automation Testing\\basic Framework\\Success.jpg");
		FileHandler.copy(S1, T1);

  }
  
  
  

  @AfterClass
  public void closebrowser() {
	  driver.close();
  }

}
