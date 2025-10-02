package assignmentprograms;

import java.util.Scanner;
public class Driverlicense {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter user age");
		int age= s.nextInt();
		System.out.println("do you have license yes/no");
	
		boolean license = s.nextBoolean();
	
		if(age>=21 && license ) {
			System.out.println("you are eligible to drive");
		}
		else {
			System.out.println("you are not eligible to drive");
		}

	}

}
