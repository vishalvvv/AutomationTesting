package assignmentprograms;

public class Lefttrianglelab {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=4;i++) {
			for(int s=1;s<=4-i;s++) {
				System.out.print(" ");
			}
			if(i==1 || i==3) {
				System.out.print("*");
			}
			else if(i==2 || i==4) {
				System.out.print("**");
			}
			else {
				System.out.print("***");
			}
			System.out.println();
		}
  
	  System.out.print("***");
  

		for(int i=1;i<=4;i++) {
			for(int s=1;s<=4-i;s++) {
				System.out.print(" ");
			}
			if(i==1 || i==3) {
				System.out.print("*");
			}
			else if(i==2 || i==4) {
				System.out.print("**");
			}
			else {
				System.out.print("***");
			}
			System.out.println();
		}
		
	}

}
