package assignmentprograms;

public class Productofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digit =321;
		int product = 1;
		   while (digit != 0) {
		int extract = digit%10;
		 product = product * extract; // multiply it
         digit = digit / 10;  
		}
    System.out.println(product);
	
	}
}
