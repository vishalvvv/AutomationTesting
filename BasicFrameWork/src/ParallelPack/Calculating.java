package ParallelPack;

import org.testng.annotations.Test;

public class Calculating {
	
  @Test
  public void Add() throws InterruptedException {
	  System.out.println("The Add track ID is: " +Thread.currentThread().getId());
	  Thread.sleep(5000);
	  int x =16;
	  int y=4;
	  System.out.println("The Sum of X and Y is: " + (x+y));
  }
  
  @Test
  public void Div() throws InterruptedException {
	  System.out.println("The DIV track ID is: " +Thread.currentThread().getId());
	  Thread.sleep(4000);
	  int x =16;
	  int y=4;
	  System.out.println("The Division of X and Y is: " + (x/y));
  }
  
  @Test
  public void Pro() throws InterruptedException {
	  System.out.println("The Product track ID is: " +Thread.currentThread().getId());
	  Thread.sleep(8000);
	  int x =16;
	  int y=4;
	  System.out.println("The Product of X and Y is: " + (x*y));
  }
  
}
