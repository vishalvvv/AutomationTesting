package thispackage;

public class Bus {
	
	int x =1111;
	
	void data() {
		int x = 2222;
		System.out.println("The Instance variable X value is" +x);
		System.out.println("The Instance variable X value is" +x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bus C = new Bus();
		C.data();
	}

}
