package assignmentprograms;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistassignment {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
     ArrayList al = new ArrayList();
     
     int n = sc.nextInt();
     for(int i=0;i<=n;i++) {
    	 al.add(i);
     }
     
     int start = al.size() - 13; 
     int end = 3;
     
     for(int k=start;k>=end;k--) {
    	 
    	 System.out.print(al.get(k)+" ");
    	 
     }
	}

}
