package KeyBoardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardClass1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions H = new Actions(driver);
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		Thread.sleep(2000);
		H.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		Thread.sleep(2000);
		driver.findElement(By.name("txtPassword")).sendKeys("cypress");
		Thread.sleep(2000);
		H.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		Thread.sleep(2000);
		H.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
	}
}
