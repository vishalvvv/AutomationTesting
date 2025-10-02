package Instancepart1;

public class Aeroplane {
	
	int numseats = 200;     // instance variable
	
	void fuel() {   // instance method
		System.out.println("tank is full");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aeroplane a = new Aeroplane();
		System.out.println(a.numseats); // accessing instance variable
	a.fuel(); // calling instance method
	}
	
	

}
