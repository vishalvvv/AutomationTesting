package ArraysPack;

public class MultiArrayClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name[][] = new String[2][5];
		
		name[0][3] = "ZeroThree";
		name[0][1] = "ZeroOne";
		name[1][1] = "OneOne";
		name[1][4] = "OneFour";
		name[0][0] = "ZeroZero";
		name[0][2] = "ZeroTwo";
		name[1][2] = "OneTwo";
		name[1][3] = "OneThree";
		name[0][4] = "ZeroFour";
		name[1][0] = "OneZero";
		
		for(int d=0;d<name.length;d++) {
			for(int k=0;k<5;k++) {
				System.out.print(name[d][k]+" ");
			}
			System.out.println();
		}
		

	}

}
