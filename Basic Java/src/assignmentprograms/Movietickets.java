package assignmentprograms;

import java.util.Scanner;
public class Movietickets {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter age ");
		int age = s.nextInt();
		  System.out.println("Is it a morning show? (true/false):");
	        boolean isMorningShow = s.nextBoolean();
		System.out.println("enter price");
		double price = s.nextDouble();
		double discount=s.nextDouble();

        if (age < 14 || age > 60) {
            discount += 0.30 * price; // 30% discount
        }

        if (isMorningShow) {
            discount += 0.20 * price; // 20% discount
        }

        double finalPrice = price - discount;

        System.out.println("Total discount: ₹" + discount);
        System.out.println("Final ticket price: ₹" + finalPrice);
	}
}
