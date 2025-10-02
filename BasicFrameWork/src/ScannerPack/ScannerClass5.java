package ScannerPack;

import java.util.Scanner;

import org.testng.annotations.Test;

public class ScannerClass5 {
  @Test
  public void agevalidations() {
	  
	  Scanner A = new Scanner(System.in);
	  
	  int first = A.nextInt();
	  
for(int i=first;i<=first+100;i++) {
	System.out.println(i);
}
  }
}
