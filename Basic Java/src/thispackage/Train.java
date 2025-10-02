package thispackage;

public class Train {
	
	int x =1111; // instance variable
	
	void data() {
		int x = 2222;  // local variable
		System.out.println("The Instance variable X value is" +this.x);  // accessing the instance variable
		System.out.println("The Instance variable X value is" +x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Train C = new Train();
		C.data();
	}

}
