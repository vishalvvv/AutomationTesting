package assignmentprograms;

import java.util.Scanner;
public class Foodordering {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		  System.out.println("Select which food you want (Sandwich/Pasta):");
	        String orderfood = s.next();

	        if (orderfood.equalsIgnoreCase("sandwich")) {
	            System.out.println("Do you want chips with sandwich?");
	            String orderchips = s.next();
	            if (orderchips.equalsIgnoreCase("yes")) {
	                System.out.println("You have ordered: Sandwich with chips");
	            } else {
	                System.out.println("You have ordered: Sandwich");
	            }
	        } else if (orderfood.equalsIgnoreCase("pasta")) {
	            System.out.println("Do you want garlic bread with pasta?");
	            String garlicbread = s.next();
	            if (garlicbread.equalsIgnoreCase("yes")) {
	                System.out.println("You have ordered: Pasta with garlic bread");
	            } else {
	                System.out.println("You have ordered: Pasta");
	            }
	        } else {
	            System.out.println("Invalid food selection.");
	        }
	}

}
