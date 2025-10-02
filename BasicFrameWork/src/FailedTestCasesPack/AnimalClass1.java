package FailedTestCasesPack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AnimalClass1 {
	
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
		  public void fx() {
			  
			String name = "Fox";
			  
			 Assert.assertEquals(name, "Fox");
			  System.out.println("the correct animal name is : " +name);
			 
		  }
			  
			  @Test
			  public void dr() {
				  
				String name = "Deer";
				  
				 Assert.assertEquals(name, "Deer");
				  System.out.println("the correct animal name is : " +name);
				 
			  }
				  @Test
				  public void rt() {
					  
					String name = "Rat";
					  
					Assert.assertEquals(name, "Rat");
					  System.out.println("the correct animal name is : " +name);
					  
  }
}
