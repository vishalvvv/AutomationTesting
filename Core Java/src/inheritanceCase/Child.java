package inheritanceCase;

public class Child extends Parent {
	
	void chi() {
		System.out.println("Hai Im chi method from child Class");
	}

	public static void main(String[] args) {
		// Case1
		System.out.println("------Case 1-------");
		Child C = new Child();
		C.par();  // valid
		C.chi();  // valid
		
		// Case2
		System.out.println("------Case 2-------");
		Parent P = new Parent();
		P.par();   // valid
     //  P.chi();      // invalid
		
		
		// Case3
				System.out.println("------Case 3-------");
				Parent A = new Child();
				A.par();   // valid
		     //  A.chi();      // invalid
				
				
				// Case4
				System.out.println("------Case 4-------");
				// Child B  = new Parent(); // invalid
				
				
				
			
	}

}
