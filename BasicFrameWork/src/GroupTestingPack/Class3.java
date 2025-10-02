package GroupTestingPack;

import org.testng.annotations.Test;

public class Class3 {
	
  @Test (groups="RT")
  public void TestCase1Class3() {
	  System.out.println("Hai iam Test Case 1 --Class3--regression");
  }
  
  @Test (groups="IT")
  public void TestCase2Class3() {
	  System.out.println("Hai iam Test Case 2 --Class3--integration");
  }
  
  @Test (groups="UT")
  public void TestCase3Class3() {
	  System.out.println("Hai iam Test Case 3 --Class3--unit");
  }
  
  
  
  
}
