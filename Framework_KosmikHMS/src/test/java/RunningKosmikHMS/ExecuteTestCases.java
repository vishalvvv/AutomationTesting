package RunningKosmikHMS;

import org.testng.annotations.Test;

import BasePack.BaseClass;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class ExecuteTestCases extends BaseClass{
  @Test
  public void testcases() throws InterruptedException, AWTException, IOException {
	  
	  Scripting S = new Scripting();
	  S.login();
	 S.onepatient();
	 S.addpatientexcel();
	 S.addpatientsexcel();
	 S.editpatient();
  S.deletepatient();
	 S.deletepatients();
	  
	  S.logout();
  }
 

}
