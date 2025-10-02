package Localpart1;

public class Cricket {

	void ipl() {
		int overs = 20;  // local variable
		System.out.println(overs);
		System.out.println(overs+"match completed");
	}
	
	void test() {
		System.out.println("now match is happenning");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Cricket c = new Cricket();
  
     c.ipl();
     c.test();  // calling local method
		
	}

}
