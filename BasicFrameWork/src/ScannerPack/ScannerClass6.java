package ScannerPack;

import java.util.Scanner;

import org.testng.annotations.Test;

public class ScannerClass6 {
  @Test
  public void agevalidations() {
	  
	  Scanner A = new Scanner(System.in);
	  System.out.print("Let me know the first number to print next 100 consecutive numbers: ");
	  
	  int first = A.nextInt();
	  
for(int i=first;i<=first+100;i++) {
	System.out.println(i);
}
  }
}
