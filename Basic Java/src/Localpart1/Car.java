package Localpart1;

public class Car {

	void name() {
		String n = "Breeza";  // local variable
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Hai Iam Main Method");
     Car k = new Car();
     k.fuel();  // method always calls
     System.out.println(k.mileage);  // value always access
     System.out.println(k.M);
     System.out.println("----------------------");
     k.name();
     k.cardata();
     
	}

	int mileage = 18;  // instance variable
	
	void fuel() {
		System.out.println("fuel used for my car is petrol");
	}
	
	String M = "speed check";  // instance variable
	
	void cardata() {
		String n = "BMW";
		System.out.println(n);
	}
}
