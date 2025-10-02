package TitleCheckspack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		
		// title 1
		String hometitle = driver.getTitle(); 
		System.out.println("The Home Page title is : "+ hometitle);
		
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		driver.findElement(By.name("txtPassword")).sendKeys("cypress");
		driver.findElement(By.name("Submit")).click();
		
		// title 2
		
		String afterlogintitle = driver.getTitle();
		System.out.println("The Title after login is : " + afterlogintitle);
		
	}

}
