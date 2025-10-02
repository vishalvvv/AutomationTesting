package ExceptionPack;

import org.testng.annotations.Test;

public class ExceptionClass1 {
  @Test
  public void data() {
	  int a =0;
	  int b = 11;
	  int c = 121;
	  
	  System.out.println("The Division of B and A is :" +(b/a));
	  System.out.println("The Division of C and B is :" +(c/b));
	  
  }
}
