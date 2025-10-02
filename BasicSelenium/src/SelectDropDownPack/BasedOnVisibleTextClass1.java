package SelectDropDownPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasedOnVisibleTextClass1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		driver.findElement(By.name("txtPassword")).sendKeys("cypress");
		driver.findElement(By.name("Submit")).click();
		
		driver.switchTo().frame(driver.findElement(By.id("rightMenu"))); // moved to frame based on web element
		
		WebElement DD = driver.findElement(By.id("loc_code"));
		
		Thread.sleep(2000);
		Select W = new Select(DD);
		W.selectByVisibleText("Supervisor");
	}

}
