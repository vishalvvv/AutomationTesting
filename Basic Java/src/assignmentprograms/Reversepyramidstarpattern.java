package assignmentprograms;

public class Reversepyramidstarpattern {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=5;i++) {
			for(int s=1;s<i;s++) {
				System.out.print("  ");
			}
		
			if(i==1) {
				System.out.print("***");
				}
			else if(i==2 || i==4) {
				System.out.print("**");
			}
			else {
				System.out.print("*");
			}
			System.out.println();
			}
			

	}

}
