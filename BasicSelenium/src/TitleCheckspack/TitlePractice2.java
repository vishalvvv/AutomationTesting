package TitleCheckspack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitlePractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Vishal\\\\\\\\Downloads\\\\\\\\chromedriver-win64\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.kosmiktechnologies.com/seleniumLiveProject/kosmik-hms/index.php?msg=Successfully%20Logged%20out");
	
	// title1
	
	String logintitle = driver.getTitle();
	System.out.println("the login title is" +logintitle);
	driver.findElement(By.name("username")).sendKeys("kosmik");
	driver.findElement(By.name("password")).sendKeys("kosmik");
	driver.findElement(By.name("submit")).click();
	
	// title2
	
	String afterlogintitle = driver.getTitle();
	System.out.println("the after login title is" + afterlogintitle);
	
	boolean displayed = driver.findElement(By.xpath("//h3[contains(text(),'Welcome, kosmik')]")).isDisplayed();
	System.out.println("the heading displayed" +displayed);
	
	
	
		
	}

}
