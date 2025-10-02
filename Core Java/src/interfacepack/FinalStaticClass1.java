package interfacepack;

public class FinalStaticClass1 {
	

	final static int dob = 771999;
	static int age = 26;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("My current age is " +age);
		System.out.println("My date of birth is " +dob);
		
		age=27;
		//dob = 881999;
		
		System.out.println("My next year age is: " +age);
	}

}
