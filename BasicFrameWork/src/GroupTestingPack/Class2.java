package GroupTestingPack;

import org.testng.annotations.Test;

public class Class2 {
	
  @Test (groups="UT")
  public void TestCase1Class2() {
	  System.out.println("Hai iam Test Case 1 --Class2--unit");
  }
  
  @Test (groups="RT")
  public void TestCase2Class2() {
	  System.out.println("Hai iam Test Case 2 --Class2--regression");
  }
  
  @Test (groups="IT")
  public void TestCase3Class2() {
	  System.out.println("Hai iam Test Case 3 --Class2--integration");
  }
  
  
  
  
}
