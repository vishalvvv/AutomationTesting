package NestefForLoop;

public class NestedForLoopClass15 {

	public static void main(String[] args) {
		
		int g=1;
		for(int r=1;r<=3;r++) {  // rows
			
			for(int c=1;c<=7;c++) {  // cols
				System.out.print((g++)%2+" ");
			}
			System.out.println();
		}

	}

}
