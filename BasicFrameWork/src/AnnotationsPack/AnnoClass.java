package AnnotationsPack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnoClass {
  @Test
  public void OriginalTestCase() {
	  System.out.println("Hai iam original Test Case");
  }
  
  @AfterClass
  public void afterClass() {
	  System.out.println("Hai Iam After class");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Hai Iam Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Hai Iam After Method");
  }
  
  @AfterSuite
  public void afterSuite() {
	  System.out.println("Hai Iam After Suite");  
  }

  

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Hai Iam Before class");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Hai Iam After Test");
  }


  @BeforeTest
  public void beforeTest() {
	  System.out.println("Hai Iam Before Test");
  }

 

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Hai Iam Before Suite"); 
  }

 
}
