package DataProviderPack;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class MyneededData {
	
  @Test(dataProvider = "mydata")
  public void TestCase(String n, String s) {
	  
	  System.out.println("The value of N is : " +n);
	   System.out.println("The value of S is : " +s);
	  
	  
  }

  @DataProvider
  public String[][] mydata(){
	  String[][] A = new String[2][2];
	  
	  A[0][0] = "ZeroZero";
	  A[0][1] = "ZeroOne";
	  A[1][0] = "OneZero";
	  A[1][1] = "OneOne";
	  
	  return A;
	  
  }
}
