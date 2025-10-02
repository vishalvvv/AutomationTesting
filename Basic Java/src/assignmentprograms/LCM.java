package assignmentprograms;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int num1 = 12;
	        int num2 = 18;
	        int lcm = Math.max(num1, num2);

	        while (true) {
	            if (lcm % num1 == 0 && lcm % num2 == 0) {
	                System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
	                break;
	            }
	            lcm++;
	        }

	}

}
