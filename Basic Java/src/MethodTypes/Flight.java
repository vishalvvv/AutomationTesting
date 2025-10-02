package MethodTypes;

public class Flight {

	static void details() {
		String name = "fly emirates";
		int seats = 300;
		System.out.println("the popular flight is" + name);
		System.out.println("no of seats are" + seats);
	}
	
	void detail() {
		String name = "ethihad airways";
		int seats = 300;
		System.out.println("the popular flight is" + name);
		System.out.println("no of seats are" + seats);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Flight f = new Flight();
		
		f.detail();
		
		details();
	}

}
