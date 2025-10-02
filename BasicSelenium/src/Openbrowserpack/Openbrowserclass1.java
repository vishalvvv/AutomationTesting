package Openbrowserpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowserclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		WebElement UN =driver.findElement(By.name("txtUserName"));
		               UN.sendKeys("selenium");
		  WebElement PWD = driver.findElement(By.name("txtPassword"));
		                        PWD.sendKeys("cypress");
		   WebElement SUB = driver.findElement(By.name("Submit"));
		                      SUB.click();
		                      
		
		
		
		
	}

}
