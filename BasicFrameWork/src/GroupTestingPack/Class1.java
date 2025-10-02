package GroupTestingPack;

import org.testng.annotations.Test;

public class Class1 {
	
  @Test (groups="IT")
  public void TestCase1Class1() {
	  System.out.println("Hai iam Test Case 1 --Class1--Integration");
  }
  
  @Test (groups="UT")
  public void TestCase2Class1() {
	  System.out.println("Hai iam Test Case 2 --Class1--unit");
  }
  
  @Test (groups="RT")
  public void TestCase3Class1() {
	  System.out.println("Hai iam Test Case 3 --Class1--regression");
  }
  
  
  
  
}
