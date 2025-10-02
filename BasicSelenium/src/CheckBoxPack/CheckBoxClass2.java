package CheckBoxPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxClass2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\Vishal\\Downloads\\Testing Tools\\Automation Testing\\basic selenium\\Selenium Elements\\Country Check box.html");
		
		Thread.sleep(4000);
		
		// driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/form/input[5]")).click();
	}

}
