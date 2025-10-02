package defaultchecks;

public class InstanceCheck {
	
	int x;
	String h;
	boolean k;
	char p;
	long r;
	float w;
	
	void data() {
		System.out.println("The Value of int x is: " + x);
		System.out.println("The Value of String h is: " + h);
		System.out.println("The Value of boolean k is: " + k);
		System.out.println("The Value of char p is: " + p);
		System.out.println("The Value of long r is: " + r);
		System.out.println("The Value of float w is: " + w);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 InstanceCheck  I = new InstanceCheck();
		 I.data();
		
	}

}
