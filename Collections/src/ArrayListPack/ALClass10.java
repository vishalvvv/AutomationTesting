package ArrayListPack;

import java.util.ArrayList;

public class ALClass10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList k = new ArrayList();
		
		k.add("parrot"); 
		k.add(4565);      
		k.add(false);      
		k.add(true);         
		k.add('U');       
		k.add(13858L);      
		k.add(false);      
		k.add(4535);       
		k.add("cat");  
		
		System.out.println(k);
		
 ArrayList m = new ArrayList();
		
		m.add("parrot"); 
		m.add(4565);      
		m.add(false);      
		m.add(true);         
		m.add('U');       
	 
		
		System.out.println(m);
		

		k.addAll(m);
		
		System.out.println(k);
		
	}

}
