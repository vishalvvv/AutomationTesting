package assignmentprograms;
import java.util.Scanner;
public class DeliveryService {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        double distance = s.nextDouble();
        double amount = s.nextDouble();
        double charge = 0;

        if (distance <= 5) charge = 10;
        else if (distance <= 20) charge = 20;
        else charge = 50;

        if (amount >= 500) charge = 0;

        System.out.println("Delivery charge: Rs. " + charge);

	}

}
