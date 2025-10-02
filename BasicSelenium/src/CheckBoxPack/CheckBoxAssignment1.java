package CheckBoxPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAssignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\Vishal\\Downloads\\Testing Tools\\Automation Testing\\basic selenium\\Selenium Elements\\Country Check box.html");
		
		Thread.sleep(4000);
		
		List<WebElement> allelements = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for (WebElement checkbox : allelements) {
		    if (!checkbox.isSelected()) {
		        checkbox.click();
		    } 
		}

		
	}

}
