package SelectDropDownPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDownAssignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
		
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		
		WebElement dropdown = driver.findElement(By.id("cars"));
		
		Select select = new Select(dropdown);
		
		List<WebElement> options = select.getOptions();
		
		  Actions actions = new Actions(driver);
		
		  System.out.println("---- Selecting Using for + if ----");

	        for (int i = 0; i < options.size(); i++) {
	            if (i == 0 || i == 2) {  // Select 1 and 3 (indexes 0 and 2)
	                actions.moveToElement(dropdown).click().perform();
	                select.selectByIndex(i);
	                System.out.println((i + 1) + ": " + options.get(i).getText());
	                Thread.sleep(1000);
	            }
	        }

	        for (int i = options.size() - 1; i >= 0; i--) {
	            if (i == 2 || i == 0) {  // Select 3 and 1
	                actions.moveToElement(dropdown).click().perform();
	                select.selectByIndex(i);
	                System.out.println((i + 1) + ": " + options.get(i).getText());
	                Thread.sleep(1000);
	            }
	        }

	        for (int i = 0; i < options.size(); i++) {
	            if (i == 0 || i == 3) {  // Select 1 and 4
	                actions.moveToElement(dropdown).click().perform();
	                select.selectByIndex(i);
	                System.out.println((i + 1) + ": " + options.get(i).getText());
	                Thread.sleep(1000);
	            }
	        }
	        
		
		
		
		
		
		

	}

}
