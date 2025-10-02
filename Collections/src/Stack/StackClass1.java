package Stack;

import java.util.Stack;

public class StackClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack J = new Stack();
		
		J.push("parrot");
		J.push(false);
		J.push("rain");
		J.push("people");
		J.push("Lion");
		J.push("Tiger");
		J.push(true);
		J.push(false);
		
		System.out.println(J);
		
		J.pop();
		
		System.out.println(J);
		
		System.out.println(J.firstElement());
		System.out.println(J.lastElement());
		
		System.out.println(J.peek());
		
	}

}
