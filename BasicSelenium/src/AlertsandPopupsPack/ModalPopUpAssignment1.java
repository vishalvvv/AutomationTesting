package AlertsandPopupsPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModalPopUpAssignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_modal");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.id("myBtn")).click();
		driver.switchTo().activeElement();
		Thread.sleep(2000);
		driver.findElement(By.className("modal-content")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("close")).click();
		driver.switchTo().defaultContent();
		
		
		
	}

}
