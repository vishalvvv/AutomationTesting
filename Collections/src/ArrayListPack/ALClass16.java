package ArrayListPack;

import java.util.ArrayList;

public class ALClass16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList k = new ArrayList();
		
		k.add("parrot"); 
		k.add(4565);      
		k.add(false);  
		k.add("cat");
		k.add(true);         
		k.add('U');       
		k.add(13858L);      
		k.add(false);      
		k.add(4535);       
		k.add("cat");  
		
		System.out.println(k);
		
		System.out.println(k.indexOf("cat"));
		
		System.out.println(k.lastIndexOf("cat"));
	}

}
