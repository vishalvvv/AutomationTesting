package assignmentprograms;

public class PyramidlabProgram {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int s=5;s<5-i;s++) {
				System.out.print(" ");
			}
				if(i%2==1) {
					System.out.print("*");
				}
				if(i%2==0) {
					System.out.print("**");
				}
				System.out.println();
			}
		}
	
}
