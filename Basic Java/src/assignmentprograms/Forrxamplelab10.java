package assignmentprograms;

public class Forrxamplelab10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=6;i++) {
			for(int s=1;s<=6-i;s++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
