package NestefForLoop;

public class NestedForLoopClass13 {

	public static void main(String[] args) {
		
		for(int r=1;r<=10;r++) {  // rows
			
			for(int c=10;c>=r;c--) {  // cols
				System.out.print(c+ " ");
			}
			System.out.println();
		}

	}

}
