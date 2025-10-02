package assignmentprograms;

public class Mworwpir {
	
	void recursion(int a,int b) {
		
		int sum = a+b;
		System.out.println("the sum of 2 numbers is"+sum);
		
		
		if(sum==0) {
			return;
		}
		else {
			recursion(a-1,b);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Mworwpir  r = new Mworwpir();
		 r.recursion(5,4);	
		 }

}
