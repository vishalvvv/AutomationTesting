package Vectorpack;

import java.util.Vector;

public class VectorClass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector V = new Vector(3,4);
		
		V.add("rain");
		V.add("man");

		System.out.println("The  capacity with 2 elements :" + V.capacity());
		
		V.add("american");
		V.add("psycho");

		
		System.out.println("The  capacity with 3+ elements :" + V.capacity());
		

		V.add("rain");
		V.add("man");
		V.add("american");
		V.add("psycho");
		
		System.out.println("The  capacity with 7+ elements :" + V.capacity());
		
		System.out.println(V.firstElement());
		System.out.println(V.lastElement());
	}

}
