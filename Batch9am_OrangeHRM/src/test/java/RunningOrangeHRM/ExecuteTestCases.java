package RunningOrangeHRM;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BasePack.BaseClass;

public class ExecuteTestCases extends BaseClass {
  
  @Test
  
  public void testcases() throws InterruptedException, AWTException, IOException {
	  
	  Scripting S = new Scripting();
	  S.login();
	//  S.oneemp();
	 //  S.oneempexcel();
	  S.multipleemployees();
  }
  
} 
