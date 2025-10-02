package assignmentprograms;

public class Switchfallthrough {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 3;
		
		switch(num) {
		case 1:
			System.out.println("the number is one");
		case 2:
			System.out.println("the number is two");
		case 3:
			System.out.println("the number is three");
		case 4:
			System.out.println("the number is four");
		case 5:
			System.out.println("the number is five");
			default:
				System.out.println("no matching case end of fall through");
		}
		
		
			
			
		
	}

}
