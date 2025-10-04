package ProductdataRunsteps;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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
@When("user enters vehicle data")
public void userentersvehicledata() {
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
@When("clicks on next button to go to insurant data page")
public void clicksonnextbuttontogotoinsurantdatapage() {
	driver.findElement(By.xpath("//button[@id='nextenterinsurantdata'] ")).click();
}
@When("user enters the insurant details")
public void userenterstheinsurantdetails() {
	 driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("John");
	 driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Doe");
		driver.findElement(By.xpath("//input[@id='birthdate']")).sendKeys("01/01/1990");
		driver.findElement(By.xpath("//label[input[@id='gendermale']]/span")).click();
		driver.findElement(By.xpath("//input[@id='streetaddress']")).sendKeys("KPHB");
		WebElement countries = driver.findElement(By.xpath("//select[@id='country']"));
		List<WebElement> allcountries = driver.findElements(By.tagName("option"));
		Select sallcountries = new Select(countries);
		sallcountries.selectByVisibleText("India");
		driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("600001");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Chennai");
       WebElement occupations = driver.findElement(By.xpath("//select[@id='occupation']"));
		List<WebElement> alloccupations = driver.findElements(By.tagName("option"));
		Select salloccupation = new Select(occupations);
		salloccupation.selectByVisibleText("Employee");
		 driver.findElement(By.xpath("//label[input[@id='speeding']]")).click();
}
@When("clicks on next button to go to product data page")
public void clicksonnextbuttontogotoproductdatapage() {
	driver.findElement(By.xpath("//button[@id='nextenterproductdata']")).click();
}
@Then("the product data page title should be displayed correctly")
public void theproductdatapagetitleshouldbedisplayedcorrectly() {
	System.out.println("The title of the page is" + driver.getTitle());
}
@Then("user enters the product details")
public void userenterstheproductdetails()  {
	 driver.findElement(By.xpath("//input[@id='startdate']")).sendKeys("11/06/2025");
	 
     WebElement insurancesum = driver.findElement(By.xpath("//select[@id='insurancesum']"));
			List<WebElement> insurances = driver.findElements(By.tagName("option"));
			Select sallinsurances = new Select(insurancesum);
			sallinsurances.selectByValue("3000000");
			 
			WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement meritrating = driver.findElement(By.xpath("//select[@id='meritrating']"));
		     Select selects = new Select(meritrating);
		     selects.selectByVisibleText("Bonus 3");	
		     
		  WebElement Damagesum = driver.findElement(By.xpath("//select[@id='damageinsurance']"));
			List<WebElement> damage = driver.findElements(By.tagName("option"));
			Select salldamage = new Select(Damagesum);
			salldamage.selectByVisibleText("Full Coverage");
			 
			WebElement span = driver.findElement(By.xpath("//label[.//input[@id='EuroProtection']]//span"));
			   JavascriptExecutor js = (JavascriptExecutor) driver;
			   js.executeScript("arguments[0].click();", span);
			   
   WebElement Courtesycars = driver.findElement(By.xpath("//select[@id='courtesycar']"));
		   List<WebElement> courtesyoptions = driver.findElements(By.tagName("option"));
		   Select sallcourtesyoptions = new Select(Courtesycars);
		   sallcourtesyoptions.selectByVisibleText("Yes");
		   
		
}
@Then("clicks on the next button")
public void clicksonthenextbutton()  {
driver.findElement(By.xpath("//*[@id=\"nextselectpriceoption\"]")).click();
}



}
