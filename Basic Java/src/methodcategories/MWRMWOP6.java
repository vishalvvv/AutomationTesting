package methodcategories;

public class MWRMWOP6 {
	
	int add() {  
		int x = 56;
		int y = 65;
		String k = "King";
		System.out.println("The sum of X and Y is:" + (x+y));
		return x-y;
	//	return y; // unreachable code
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		 MWRMWOP6 M = new  MWRMWOP6();
		System.out.println("the difference of x and y is" +M.add()); // first method calls and second it returns value
	}

}
