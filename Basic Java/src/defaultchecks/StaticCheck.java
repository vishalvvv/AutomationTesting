package defaultchecks;

public class StaticCheck {
	
	static int x;
	static String h;
	static boolean k;
	static char p;
	static long r;
	static float w;
	
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
