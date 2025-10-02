package RobotPack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass3 {

	public static void main(String[] args) throws InterruptedException, AWTException {
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
		
		//Challenge1: Go to location of the file and copy the file name
		 
		Thread.sleep(1000);
		StringSelection J = new StringSelection("\"C:\\Users\\Vishal\\Downloads\\Testing Tools\\Automation Testing\\basic java\\Variables.jpg\"");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(J, null); // copying the name
		
		// Challenge2: Paste the File location in FileName text box
		
		Thread.sleep(1000);
		Robot R = new Robot();
		
		R.keyPress(KeyEvent.VK_CONTROL);
		R.keyPress(KeyEvent.VK_V);
		R.keyRelease(KeyEvent.VK_CONTROL);
		R.keyRelease(KeyEvent.VK_V);
		
		// Challenge 3: Hit Enter
		
		Thread.sleep(1000);
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
	}

}
