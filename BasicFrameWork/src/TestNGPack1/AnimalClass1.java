package TestNGPack1;

import org.testng.annotations.Test;

public class AnimalClass1 {
	
  @Test
  public void hrs() {
	  
	String name = "Horse";
	  
	  if(name.equals("Horse")) {
	  System.out.println("the correct animal name is : " +name);
	  }
	  else {
		  System.out.println("Incorrect Animal name");
	  }
  }
	  
	  @Test
	  public void ox() {
		  
		String name = "Ox";
		  
		  if(name.equals("Ox")) {
		  System.out.println("the correct animal name is : " +name);
		  }
		  else {
			  System.out.println("Incorrect Animal name");
		  }
	  }
		  @Test
		  public void fx() {
			  
			String name = "Fox";
			  
			  if(name.equals("Fox")) {
			  System.out.println("the correct animal name is : " +name);
			  }
			  else {
				  System.out.println("Incorrect Animal name");
			  }
		  }
			  
			  @Test
			  public void dr() {
				  
				String name = "Deer";
				  
				  if(name.equals("Deer")) {
				  System.out.println("the correct animal name is : " +name);
				  }
				  else {
					  System.out.println("Incorrect Animal name");
				  }
			  }
				  @Test
				  public void rt() {
					  
					String name = "Raat";
					  
					  if(name.equals("Rat")) {
					  System.out.println("the correct animal name is : " +name);
					  }
					  else {
						  System.out.println("Incorrect Animal name");
					  }
  }
}
