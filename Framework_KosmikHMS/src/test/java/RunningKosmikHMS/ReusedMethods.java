package RunningKosmikHMS;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ReusedMethods extends ExecuteTestCases {
  
  
  public WebElement xp(String k) {
	  return driver.findElement(By.xpath(obj.getProperty(k)));
  }
  
  public void t(int g) throws InterruptedException{
	  int h = 1000*g;
	  Thread.sleep(h);
  }
  


}
