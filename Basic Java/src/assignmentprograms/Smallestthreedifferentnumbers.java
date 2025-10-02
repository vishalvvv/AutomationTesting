package assignmentprograms;

public class Smallestthreedifferentnumbers {

	public static void main(String[] args) {
		
		int num1 = 43, num2 = 52, num3 = 32; 
		
		if(num1<num2 && num1<num3) {
			System.out.println("smallest number is " + num1);
		}
		else if(num2<num1 && num2<num3) {
			System.out.println("smallest number is " + num2);
		}
		else {
			System.out.println("smallest number is " + num3);
		}
	}

}
