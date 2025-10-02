package Kosmik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Kosmik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.edge.driver","C:\\Users\\Vishal\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		 WebDriver  driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kosmiktechnologies.com/seleniumLiveProject/kosmik-hms/index.php?msg=Successfully%20Logged%20out");
		driver.findElement(By.name("username")).sendKeys("kosmik");
		driver.findElement(By.name("password")).sendKeys("kosmik");
		driver.findElement(By.name("submit")).click();
		//driver.findElement(By.linkText("Registration")).click();
	//	driver.findElement(By.xpath("//a[@href='perminent_registration.php' and text()='Registration']")).click();
		driver.findElement(By.xpath("//a[text()='Registration']")).click();
		driver.findElement(By.xpath("//a[contains(@href, 'perminent_registraion_update.php?rg_seq_id') and text()='Edit']")).click();


	}

}
