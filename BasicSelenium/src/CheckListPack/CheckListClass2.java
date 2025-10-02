package CheckListPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckListClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\Vishal\\Downloads\\Testing Tools\\Automation Testing\\basic selenium\\Selenium Elements\\Country Name.Htm");
		
		WebElement CL = driver.findElement(By.id("CheckList"));
		
		   List<WebElement> allcountries =  CL.findElements(By.tagName("option"));
		   
		   System.out.println("The Number of Countries are : " +allcountries.size());
		   
		   Select T = new Select(CL);
		   
		   T.selectByIndex(81);
		   T.selectByVisibleText(" Chile");
		   T.selectByVisibleText(" Papua New Guinea");
		   T.selectByIndex(123);
		   T.selectByIndex(211);
		
	}

}
