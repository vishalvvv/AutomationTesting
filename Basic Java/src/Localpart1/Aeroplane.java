package Localpart1;

public class Aeroplane {
	
	void flightclasses() {
		int classes =2; // local variable
		System.out.println(classes);
		System.out.println("im in business class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Aeroplane a =  new Aeroplane();
       a.flightclasses();  // accessing local methods
	}

}
