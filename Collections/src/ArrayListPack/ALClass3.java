package ArrayListPack;

import java.util.ArrayList;

public class ALClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList k = new ArrayList();
		
		k.add("parrot"); //0
		k.add(4565);       //1
		k.add(false);      //2
		k.add(true);         //3
		k.add('U');       //4
		k.add(13858L);      //5
		k.add(false);      //6
		k.add(4535);       //7
		k.add("cat");     //8
		
		System.out.println(k);
		
		for(int d=0;d<=8;d++) {
		System.out.println(k.get(d));
		}
	}

}
