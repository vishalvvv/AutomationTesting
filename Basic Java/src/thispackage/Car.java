package thispackage;

public class Car {
	
	int x =1111;
	
	void data() {
		int y =2222;
		System.out.println("The instance variable X value is :" +x);
		System.out.println("The local variable Y value is :" +y);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Car C = new Car();
     C.data();
	}

}
