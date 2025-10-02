package ScannerPack;

import java.util.Scanner;

import org.testng.annotations.Test;

public class ScannerClass2 {
  @Test
  public void agevalidations() {
	  
	  Scanner B = new Scanner(System.in);
	  
	  int sonage = B.nextInt();
	  int fatherage = 30+sonage;
	  System.out.println("The Son Age is : " +sonage);
	  System.out.println("The Father Age is : " +fatherage);
  }
}
