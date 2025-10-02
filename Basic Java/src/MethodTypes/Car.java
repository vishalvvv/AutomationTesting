package MethodTypes;

public class Car {

	String name = "mercedes benz";
	
	static int mileage = 10;
	
	static void details() {
		System.out.println("the car is available to buy");
		
		// System.out.println("the car name is" + c.name);
		System.out.println("the car mileage is" + mileage);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
	System.out.println("the car name is" +c.name);	
    details();
	}

}
