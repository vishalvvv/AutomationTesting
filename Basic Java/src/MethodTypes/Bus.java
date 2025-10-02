package MethodTypes;

public class Bus {
	
	 int speed = 70;  // instance variable
	static String status = "running";  // static variable

	void moving() {
		System.out.println("the bus is max speed is 150 kmph");
		System.out.println("the bus is moving at current speed" + speed);
		System.out.println("the bus status is" + status);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bus b = new Bus();
		System.out.println(b.speed); // accessing instance variable
		System.out.println(status);  // accessing static method
		b.moving();  // calling non static method
	}

}
