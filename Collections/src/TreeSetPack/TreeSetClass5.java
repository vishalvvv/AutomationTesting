package TreeSetPack;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     TreeSet T  = new TreeSet();
     T.add(4755);
     T.add(78554);
     T.add(2575);
     T.add(4575);
     T.add(9875);
     T.add(852577);
     T.add(557139);
     T.add(414530);
     T.add(636810);   
     
    System.out.println(T);
    
    Iterator P = T.descendingIterator();
    
    while(P.hasNext()) {
        System.out.println(P.next());
    }

    
	}

}
