package StaticPart1;

public class Car {
	
	static String name = "rollsroyce";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c = new Car();

		System.out.println("i can call directly " + name);
		System.out.println("i can call through creating object of car" + c.name);
		System.out.println("i can call through classname" + Car.name);
	}

}
