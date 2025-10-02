package Vectorpack;

import java.util.Vector;

public class VectorClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector V = new Vector();
		

		V.add("parrot");
		V.add(46435);
		V.add(false);
		V.add(true);
		V.add('u');
		V.add(45225L);
		V.add(false);
		V.add(7454);
		V.add("cat");
		V.add("hello");
		
		
		
			System.out.println("The  capacity with 10 elements :" + V.capacity());
		
		V.add("Yes Yes Yes");
		
		System.out.println("The  capacity with 10+ elements :" + V.capacity());
		
		V.add("parrot");
		V.add(46435);
		V.add(false);
		V.add(true);
		V.add('u');
		V.add(45225L);
		V.add(false);
		V.add(7454);
		V.add("cat");
		V.add("hello");
		
		
		System.out.println("The  capacity with 20+ elements :" + V.capacity());
		
	}

}
