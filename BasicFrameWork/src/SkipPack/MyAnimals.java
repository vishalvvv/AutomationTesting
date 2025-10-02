package SkipPack;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class MyAnimals {
  @Test
  public void f() {
  }
  
  @Test
  public void hrs() {
	  
	String name = "Horse";
	  
	  Assert.assertEquals(name, "Horse");
	  System.out.println("the correct animal name is : " +name);
	  
	  
  }
	  
	  @Test
	  public void ox() {
		  
		String name = "Ox";
		  
		  
		  Assert.assertEquals(name, "Ox");
		  System.out.println("the correct animal name is : " +name);
		 
	  }
	  
	  @Test
	  public void drivingtest() {
		  int age = 15;
		  if(age<18) {
			  throw new SkipException("Candidate is not eligible for Driving Test");
		  }
		  else {
			  System.out.println("Candidate is eligible for Driving Test");
		  }
	  }
		  @Test (enabled=false)
		  public void fx() {
			  
			String name = "Fox";
			  
			 Assert.assertEquals(name, "Fox");
			  System.out.println("the correct animal name is : " +name);
			 
		  }
			  
			  @Test
			  public void dr() {
				  
			throw new SkipException("Here I dont want to Run Method with Method name as dr");
				
				 
			  }
				  @Test
				  public void rt() {
					  
					String name = "Rat";
					  
					Assert.assertEquals(name, "Rat");
					  System.out.println("the correct animal name is : " +name);
					  
  }
}
