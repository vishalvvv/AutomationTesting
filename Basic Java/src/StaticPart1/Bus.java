package StaticPart1;

public class Bus {

	static String C = "Green";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Accessing C value directly as : " + C);
		Bus B = new Bus();
		System.out.println("Accessing C with object reference as : " + B.C);
		
		System.out.println("Accessing based upon on classname : " + Bus.C);
		
	}

}
