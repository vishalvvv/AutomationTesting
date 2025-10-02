package Instancepart1;

public class instancevariables {
	
	void car() {
		System.out.println("im in car");
		
	}
	
	int mileage = 20;  // instance variable

	public static void main(String[] args) {
		System.out.println("hello iam main method");
    instancevariables I = new instancevariables();
    I.car();
    System.out.println(I.mileage);  // accessing instance variable
	}
	
	

}
