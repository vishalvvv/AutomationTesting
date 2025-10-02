package methodcategories;

public class MWRMWOP4 {
	
	String add() {  // String is a return type which returns string value and without any parameters
		int x = 56;
		int y = 65;
		String k = "King";
		System.out.println("The sum of X and Y is:" + (x+y));
		return k;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		 MWRMWOP4 M = new  MWRMWOP4();
		System.out.println(M.add()); // first method calls and second it returns value
	}

}
