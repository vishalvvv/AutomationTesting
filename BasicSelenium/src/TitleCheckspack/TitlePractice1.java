package TitleCheckspack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitlePractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdiver.chrome.driver", "C:\\\\Users\\\\Vishal\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kosmiktechnologies.com/seleniumLiveProject/kosmik-hms/index.php?msg=Successfully%20Logged%20out");
		
		// title1
		
		String hometitle = driver.getTitle();
		System.out.println("the home page title is" + hometitle);
		driver.findElement(By.name("username")).sendKeys("kosmik");
		driver.findElement(By.name("password")).sendKeys("kosmik");
		driver.findElement(By.name("submit")).click();
		
		// title 2
		
		String afterlogintitle = driver.getTitle();
		System.out.println("the title after login is" + afterlogintitle);
		
		
	}

}
