package ExceptionPack;

import org.testng.annotations.Test;

public class ExceptionClass2 {
  @Test
  public void data() {
	  int a =0;
	  int b = 11;
	  int c = 121;
	  
	  try {
	  System.out.println("The Division of B and A is :" +(b/a));
	  }
	  catch(Exception e) {
		  System.out.println("Please dont't divide with ZERO");
	  }
	  System.out.println("The Division of C and B is :" +(c/b));
	  
  }
}
