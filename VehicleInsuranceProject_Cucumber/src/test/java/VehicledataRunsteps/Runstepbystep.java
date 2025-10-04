package VehicledataRunsteps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Runstepbystep {

	public static WebDriver driver;
	

@Given("user gives application URL")
public void usergivesapplicationurl() {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Vishal\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	 driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://sampleapp.tricentis.com/101/app.php");
}
@Then("check the title of home page")
public void checkthetitleofhomepage() {
  System.out.println("The title of the page is" + driver.getTitle());
}
@When("enter vehicle data")
public void entervehicledata() {
	 WebElement make =driver.findElement(By.xpath("//select[@id='make']"));
		List<WebElement> companies = driver.findElements(By.tagName("option"));
		Select s = new Select(make);
		s.selectByVisibleText("Audi");
		WebElement model = driver.findElement(By.xpath("//select[@id='model']"));
		Select sallmodels = new Select(model);
		   sallmodels.selectByVisibleText("Moped");
		   driver.findElement(By.xpath("//input[@id='cylindercapacity']")).sendKeys("100");
		   driver.findElement(By.xpath("//input[@id='engineperformance']")).sendKeys("1200");
		   driver.findElement(By.xpath("//input[@id='dateofmanufacture']")).sendKeys("01/01/2020");
		   WebElement radio = driver.findElement(By.id("righthanddriveyes"));
		   ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radio);
WebElement noofseats= driver.findElement(By.xpath("//select[@id='numberofseats']"));
			Select snoofseats = new Select(noofseats);
			snoofseats.selectByIndex(7);
			WebElement motorcycle = driver.findElement(By.xpath("//select[@id='numberofseatsmotorcycle']"));
		       Select smotorcycle = new Select(motorcycle);
		       smotorcycle.selectByValue("2");
			 WebElement fuels = driver.findElement(By.xpath("//select[@id='fuel']"));
			 Select sfuels = new Select(fuels);
		     sfuels.selectByVisibleText("Petrol");
			 driver.findElement(By.xpath("//input[@id='payload']")).sendKeys("500");
			driver.findElement(By.xpath("//input[@id='totalweight']")).sendKeys("1000");
		 	driver.findElement(By.xpath("//input[@id='listprice']")).sendKeys("50000");
		 	driver.findElement(By.xpath("//input[@id='licenseplatenumber']")).sendKeys("AB123CD");
		 	driver.findElement(By.xpath("//input[@id='annualmileage']")).sendKeys("10000");
    
}
@When("click on next button")
public void clickonnextbutton() {
	driver.findElement(By.xpath("//button[@id='nextenterinsurantdata'] ")).click();
}


}
