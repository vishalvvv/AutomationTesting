package Interviewtask;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Interviewtask3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver","‪C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
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

}
