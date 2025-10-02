package TitleCheckspack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		
		// title 1
		String hometitle = driver.getTitle(); 
		
		if(hometitle.equals("OrangeHRM - New Level of HR Management")) {
			System.out.println("The home page Title validated");
		}
		else {
			System.out.println("Incorrect home page title");
		}
		
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		driver.findElement(By.name("txtPassword")).sendKeys("cypress");
		driver.findElement(By.name("Submit")).click();
		
		// title 2
		
		String afterlogintitle = driver.getTitle();
		
		if(afterlogintitle.equals("OrangeHRM")) {
			System.out.println("After login  page title validated");
		}
		else {
			System.out.println("Incorrect login  page title ");
		}
		
	}

}
