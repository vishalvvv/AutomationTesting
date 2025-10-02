package supercase1;

public class Cub extends Lion {
	
	Cub(){
		System.out.println("Hai I am Default Cub Constructor");
		super.role();
		System.out.println("in constructor: "+super.name);
	}
	
	void data() {
		System.out.println("Hai I am data method from cub class");
		System.out.println("In Method: "+super.name);
		super.role();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              Cub H = new Cub();
              System.out.println("------------------------------------------");
              H.data();
	}

}
