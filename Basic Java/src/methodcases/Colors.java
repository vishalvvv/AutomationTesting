package methodcases;

public class Colors {

	void red() {
		yellow();
		System.out.println("im non static method -- red");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		green();
		Colors c = new Colors();
		c.red();

	}
 static void green() {
	System.out.println("im  static method -- green");
}
 static void blue() {
		System.out.println("im  static method -- blue");
	}
void yellow() {
	blue();
	System.out.println("hi iam non-static method--yellow");
	
}
 
}
