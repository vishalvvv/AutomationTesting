package Instancepart1;

public class Football {

	int groundsize = 45;  // instance variable
	
	void matchthere() {  // instance method 
		System.out.println("match is there today night");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Football f = new Football();
           System.out.println(f.groundsize);  // accessing instance variable
           
           f.matchthere();  // calling instance method
	}

}
