package methodcategories;

public class MWRMWOP5 {
	
	int add() {  
		int x = 56;
		int y = 65;
		String k = "King";
		System.out.println("The sum of X and Y is:" + (x+y));
		return x;
	//	return y; // unreachable code
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		 MWRMWOP5 M = new  MWRMWOP5();
		System.out.println(M.add()); // first method calls and second it returns value
	}

}
