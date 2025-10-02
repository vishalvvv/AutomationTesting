package AlertsandPopupsPack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsClass1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Vishal/Downloads/Testing%20Tools/Automation%20Testing/basic%20selenium/Selenium%20Elements/Alert%20Message.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/button")).click();
		Alert T = driver.switchTo().alert();
		Thread.sleep(3000);
		T.accept(); // press on ok
	//	T.dismiss(); // press on cancel
	}

}
