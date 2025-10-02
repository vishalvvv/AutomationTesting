package methodcategories;

public class MWRMWOP2 {
	
	int add() {  // int is a return type which returns int value and without any parameters
		int x = 56;
		int y = 65;
		System.out.println("The sum of X and Y is:" + (x+y));
		return y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		 MWRMWOP2 M = new  MWRMWOP2();
		System.out.println(M.add()); // first method calls and second it returns value
	}

}
