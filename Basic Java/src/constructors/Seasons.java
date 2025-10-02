package constructors;

public class Seasons {
	
	void summer() {
		System.out.println("---it's very hot in summer--------");
	}
	
	String w = "Winter";
	
	Seasons(){
	 summer();
	 System.out.println("Season with cold Temperature is: " +w);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new Seasons();
	}

}
