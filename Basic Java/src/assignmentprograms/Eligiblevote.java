package assignmentprograms;
import java.util.Scanner;
public class Eligiblevote {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter person age");
		int age=s.nextInt();
		System.out.println("Is the person a citizen? (yes/no):");
		String citizen = s.next();
	
		if(age>=16 && citizen.equalsIgnoreCase("yes") ) {
		System.out.println("you are eligible to vote");
		}
		else {
			System.out.println("you are not eligible to vote");
		}

	}

}
