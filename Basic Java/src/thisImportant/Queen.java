package thisImportant;

public class Queen {
	
	
	Queen(){
		System.out.println("--------Hai Iam Default Constructor");
	}
	
	void orange() {
		// this(); // Constructor call must be the first statement in a constructor
	}
	
	Queen(int p){
		this();
		System.out.println("Hai Iam one int parameterised Constructor");
	}

	public static void main(String[] args) {
		
	new Queen(1122);
	
	

	}

}
