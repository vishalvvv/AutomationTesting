package AssignnmentforHyperlinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinkAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Vishal/Downloads/Testing%20Tools/Automation%20Testing/basic%20selenium/Selenium%20Elements/Hyper%20links.html");
		driver.findElement(By.linkText("T & J")).click();
	}

}
