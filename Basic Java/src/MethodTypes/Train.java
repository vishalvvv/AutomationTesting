package MethodTypes;

public class Train {

	String c= "Red";  // instance variable
	static int w = 1234;  // static variable
	
	void speed() {
		System.out.println("my train runs at 120 kmph");
		System.out.println("the color of the train is" + c);
		System.out.println("the number of people in the train are" + w);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Train t = new Train();
  t.speed();
	}

}
