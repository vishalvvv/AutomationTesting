package LinkedListPack;

import java.util.LinkedList;

public class LLClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList L = new LinkedList();
		
		L.add("parrot"); 
		L.add(4565);      
		L.add(false);      
		L.add(true);         
		L.add('U');       
		L.add(13858L);      
		L.add(false);      
		L.add(4535);       
		L.add("cat");  
		
		System.out.println(L);
		
	 L.addFirst("Tiger");
	 L.addLast("Lion");
	 L.add(L.size()/2,"Good");
	 L.add(3,"bad");
	 System.out.println(L);
	 
	 L.removeFirst();
	 L.removeLast();
	 
	 System.out.println(L);

	}

}
 