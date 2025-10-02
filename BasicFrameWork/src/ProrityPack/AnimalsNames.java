package ProrityPack;

import org.testng.annotations.Test;

public class AnimalsNames {
	
  @Test (priority=-5)
  public void fox() {
	  System.out.println("Hai Iam fox Method----5");
  }
  
  @Test  (priority=4)
  public void jaguar() {
	  System.out.println("Hai Iam jaguar Method------4");
  }
  
  @Test (priority=2)
  public void hen() {
	  System.out.println("Hai Iam hen Method.....2");
  }
}
