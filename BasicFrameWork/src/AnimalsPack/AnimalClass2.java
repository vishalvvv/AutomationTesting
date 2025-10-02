package AnimalsPack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AnimalClass2 {
	
  @Test
  public void dnk() {
	  
	String name = "Donkey";
	  
	  Assert.assertEquals(name, "Donkey");
	  System.out.println("the correct animal name is : " +name);
	  
	  
  }
	  
	  @Test
	  public void hn() {
		  
		String name = "Hen";
		  
		  
		  Assert.assertEquals(name, "Hen");
		  System.out.println("the correct animal name is : " +name);
		 
	  }
		  @Test
		  public void fx() {
			  
			String name = "Fox";
			  
			 Assert.assertEquals(name, "Fox");
			  System.out.println("the correct animal name is : " +name);
			 
		  }
			  
			  @Test
			  public void mnk() {
				  
				String name = "Monday";
				  
				 Assert.assertEquals(name, "Monkey");
				  System.out.println("the correct animal name is : " +name);
				 
			  }
				  @Test
				  public void ele() {
					  
					String name = "Elephant";
					  
					Assert.assertEquals(name, "elephant");
					  System.out.println("the correct animal name is : " +name);
					  
  }
}
