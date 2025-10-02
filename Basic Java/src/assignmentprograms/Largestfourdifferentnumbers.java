package assignmentprograms;

public class Largestfourdifferentnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 20,num2 = 30,num3 = 15,num4 = 35;
		
		if(num1>num2 && num1>num3 && num1>num4) {
			System.out.println("largest number is" + num1);
		}
		if(num2>num1 && num2>num3 && num2>num4) {
			System.out.println("largest number is" + num2);
		}
		if(num3>num1 && num3>num2 && num3>num4) {
			System.out.println("largest number is" + num3);
		}
		if(num4>num1 && num4>num3 && num4>num2) {
			System.out.println("largest number is" + num4);
		}
	}
	

}
