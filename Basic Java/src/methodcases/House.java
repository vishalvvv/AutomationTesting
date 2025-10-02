package methodcases;

public class House {

	static void hall() {
		System.out.println("im in hall");
		
	//	bedroom(); cant call non static method in static method directly
	}
	
	void bedroom() {
		System.out.println("im in bedroom");
		bathroom();
		}
	
	void bathroom() {
		System.out.println("im in bathroom");
	}
	
	static void kitchen() {
		System.out.println("im in kitchen");
		hall();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
House h = new House();
System.out.println("im in the house");

h.bedroom();
h.bathroom();
 hall();
 kitchen();
		
	}

}
