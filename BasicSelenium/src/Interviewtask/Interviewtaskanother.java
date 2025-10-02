package Interviewtask;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Interviewtaskanother {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver","C:\\Users\\Vishal\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoblaze.com/");
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.id("sign-username")).sendKeys("devraj@gmail.com");
		driver.findElement(By.id("sign-password")).sendKeys("ab123");
		Thread.sleep(2000);
		driver.switchTo().activeElement();
		driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
		
		Thread.sleep(5000);
		
		Alert T =driver.switchTo().alert();
		T.accept();
		
		

	}

}
