package MethodTypes;

public class TrainData {
	
	
	String c = "Red"; // instance variable
	static int w = 1234;  // static variable
	
	
	void speed() {
		System.out.println("my train runs at 120 kmph");
		System.out.println("the color of the train is" + c);
		System.out.println("the number of people in the train are"+ w);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TrainData t = new TrainData();
		t.speed(); //  accessing non-static method using the object reference
		System.out.println("---------------------------------------");
		halts(); // accessing directly static method
	}
	
	static void halts() {
		System.out.println("the number of halts are 16 stations");
		// System.out.println(c); // cannot make  static reference  to the non-static field c
		System.out.println("the number of people in the train from static method :" +w);
	}

}
