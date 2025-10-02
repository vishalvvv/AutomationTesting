package NestedIf;

public class NestedIfClass1 {

	public static void main(String[] args) {
		
		
		int x = 56;
		int y = 71;
		int z = 12;
		
		if(x>z) {
			System.out.println("Z is less  than X");
			if(y>z) {
				System.out.println("Y is more  than Z");
			}
			if(x<y) {
				System.out.println("X is less  than Y");
			}
		}

	}

}
