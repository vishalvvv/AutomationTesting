package FailedTestCasesPack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AnimalClass3 {
	
  @Test
  public void cht() {
	  
	String name = "Cheetah";
	  
	  Assert.assertEquals(name, "Cheetah");
	  System.out.println("the correct animal name is : " +name);
	  
	  
  }
	  
	  @Test
	  public void yk() {
		  
		String name = "Yak";
		  
		  
		  Assert.assertEquals(name, "Yak");
		  System.out.println("the correct animal name is : " +name);
		 
	  }
		  @Test
		  public void cw() {
			  
			String name = "Cow";
			  
			 Assert.assertEquals(name, "Cow");
			  System.out.println("the correct animal name is : " +name);
			 
		  }
			  
			  @Test
			  public void mse() {
				  
				String name = "Mouse";
				  
				 Assert.assertEquals(name, "Mouse");
				  System.out.println("the correct animal name is : " +name);
				 
			  }
				  @Test
				  public void bfl() {
					  
					String name = "Buffalo";
					  
					Assert.assertEquals(name, "Buffalo");
					  System.out.println("the correct animal name is : " +name);
					  
  }
}
