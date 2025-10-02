package POMTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ScriptPOM extends POMTesting{
	
	
	@FindBy (xpath="//input[@type='text']") WebElement U;
	@FindBy (xpath="//input[@type='password']") WebElement P;
	@FindBy (xpath="//input[@type='Submit']") WebElement L;
	
	public void login(String UN,String PWD) {
	 driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
	  U.sendKeys(UN);
	  P.sendKeys(PWD);
    L.click();
	}

}
