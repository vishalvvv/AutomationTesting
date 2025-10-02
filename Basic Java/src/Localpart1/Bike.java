package Localpart1;

public class Bike {

	void bikeservice() {  
		int tyresize = 23;  // localvariable
		System.out.println(tyresize);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Bike b = new Bike();
    b.bikeservice();    // calling local method
   
	}

}
