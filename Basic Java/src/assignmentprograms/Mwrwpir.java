package assignmentprograms;

public class Mwrwpir {
	
	int recursion(int a,int b) {
		
		if(a==b) {
			return 0;
		}
		else {
			return 1+ recursion(a-1,b);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Mwrwpir  r = new Mwrwpir();
		 System.out.println("the subtraction of 2 numbers is "+r.recursion(45, 4));
	}

}
