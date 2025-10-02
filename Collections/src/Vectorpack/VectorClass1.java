package Vectorpack;

import java.util.Vector;

public class VectorClass1 {

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
	
		
		
		System.out.println("The default capacity with 9 elements :" + V.capacity());
		
	}

}
