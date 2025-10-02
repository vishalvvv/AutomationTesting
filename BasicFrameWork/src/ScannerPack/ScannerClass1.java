package ScannerPack;

import org.testng.annotations.Test;

public class ScannerClass1 {
  @Test
  public void agevalidations() {
	  int sonage = 23;
	  int fatherage = 30+sonage;
	  System.out.println("The Son Age is : " +sonage);
	  System.out.println("The Father Age is : " +fatherage);
  }
}
