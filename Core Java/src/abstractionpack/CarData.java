package abstractionpack;

public abstract class CarData {  // today 11 july
	
	abstract void color();
	abstract void fuel();
	abstract void model();
	
	void tyres() {
		System.out.println("My car has four tyres");
	}

}
