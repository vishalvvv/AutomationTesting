package ScreenShotsPack;

import org.testng.annotations.Test;

public class Hello {
  @Test
  public void M1() {
	  System.out.println("Hai Iam  M1 Method");
	  M2();
  }
  
  public void M2() {
	  System.out.println("Hai Iam  M2 Method");
  }
}
