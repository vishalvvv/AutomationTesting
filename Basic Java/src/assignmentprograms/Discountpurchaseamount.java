package assignmentprograms;

import java.util.Scanner;

public class Discountpurchaseamount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		

        System.out.println("Enter purchase amount:");
		int purchaseamount = s.nextInt();
		

        System.out.println("Are you a member? (true/false):");
		boolean ismember = s.nextBoolean();
				
		if(purchaseamount>80 && ismember) {
			int discount = purchaseamount*15/100;
			System.out.println(" 15 percent discount is applied" +discount);
		}
		else if(purchaseamount>80 && !ismember){
		int	discount = purchaseamount*5/100;
		System.out.println(" 5 percent discount is applied" +discount);
		}
		else {
			System.out.println("no discount is applied");
		}
	}

}
