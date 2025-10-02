package WindowsPack;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsClass2 {

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
		System.out.println("After Login Into the Application : " + driver.getTitle());
		
		Actions A = new Actions(driver);
		
		A.moveToElement(driver.findElement(By.id("help"))).perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"help\"]/ul/li[2]/a/span")).click();
		
		Thread.sleep(5000);
		
	//	System.out.println("After Click on Support : " +driver.getTitle());
		
		Set<String> allopenedwins = driver.getWindowHandles();  // not in order
		
		System.out.println("The Opened windows are : " +allopenedwins.size());
		
		ArrayList<String> myorder = new ArrayList(allopenedwins); // making them as order
		
		driver.switchTo().window(myorder.get(1)); // driver switch to child
		
		Thread.sleep(5000);
		
		System.out.println("After Logic implementation: " +driver.getTitle());
		
		

	}

}
