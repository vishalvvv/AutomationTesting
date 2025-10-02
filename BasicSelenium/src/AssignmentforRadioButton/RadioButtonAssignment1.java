package AssignmentforRadioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Vishal/Downloads/Testing%20Tools/Automation%20Testing/basic%20selenium/Selenium%20Elements/Gender%20Radio%20%20Button.html");
  // driver.findElement(By.xpath("/html/body/form/input[2]")).click();

driver.findElements(By.name("gender")).get(0).click();

  
	}

}
