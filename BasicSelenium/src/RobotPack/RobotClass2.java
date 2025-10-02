package RobotPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		

		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		driver.findElement(By.name("txtPassword")).sendKeys("cypress");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(1000);
		WebElement W =driver.findElement(By.id("pim"));
		Actions H = new Actions(driver);
		H.moveToElement(W).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"pim\"]/ul/li[2]/a/span")).click();
		Thread.sleep(1000);
		
		driver.switchTo().frame(driver.findElement(By.id("rightMenu")));
		driver.findElement(By.id("txtEmployeeId")).clear();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("txtEmployeeId")).sendKeys("3377");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Father");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Child");
		driver.findElement(By.name("txtEmpMiddleName")).sendKeys("Mother");
		driver.findElement(By.name("txtEmpNickName")).sendKeys("Sister");
		
		Thread.sleep(2000);
		
	//	driver.findElement(By.name("photofile")).click();
		
		H.moveToElement(driver.findElement(By.name("photofile"))).click().perform();
		
		
	}

}
