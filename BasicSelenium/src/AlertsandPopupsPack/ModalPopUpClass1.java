package AlertsandPopupsPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModalPopUpClass1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Vishal/Downloads/Testing%20Tools/Automation%20Testing/basic%20selenium/Selenium%20Elements/Model%20Popup.html");
		Thread.sleep(3000);
		driver.findElement(By.id("Modal")).click();
	driver.switchTo().activeElement(); // driver switch to modal popup
	Thread.sleep(3000);
	 driver.findElement(By.className("close")).click();
	
	
  	}

}
