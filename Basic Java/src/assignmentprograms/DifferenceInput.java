package assignmentprograms;

import java.util.Scanner;
public class DifferenceInput {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter value of num1");
		
		int num1 = s.nextInt();
		
		
		System.out.println("enter value of num2");
		
		int num2 = s.nextInt();
		
		int difference = num1-num2;
		
		if(difference>0) {
			System.out.println("the number is positive");
		}
		else {
			System.out.println("the number is negative");
		}
		
				
	}

}
