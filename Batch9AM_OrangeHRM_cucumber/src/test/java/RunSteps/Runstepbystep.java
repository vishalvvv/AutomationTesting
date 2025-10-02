package RunSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.*;

public class Runstepbystep {
	
	public static WebDriver driver;

@Given("User gives application URL")
public void applicationurl() {
	
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Vishal\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	 driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
    
}

@Then("check the title of the home page")
public void homepagetitle() {
	System.out.println("The Home Page Title is : "+ driver.getTitle());
	
    
}
@Then("Enter username")
public void username() {
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
}
@Then("Enter Password")
public void  password() {
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("selenium");
}

@When("after enter username and password and click on login button")
public void loginbutton() {
	  driver.findElement(By.xpath("//input[@type='Submit']")).click();
}
@Then("check the title after login title")
public void titleafterlogin() {
	System.out.println("The After Login Page Title is : "+ driver.getTitle());
}



}
