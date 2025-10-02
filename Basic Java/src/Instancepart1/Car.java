package Instancepart1;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("iam in main method");
  Car k = new Car();
  k.fuel(); // method always "calls"
  System.out.println(k.mileage); // value always "access
  System.out.println(k.M); 
		
	}

	int mileage = 18; // instance  variable
	void fuel() {
		System.out.println("Fuel used for My car is petrol");
		}
	
	String M = "speed check"; // instance  variable
}
