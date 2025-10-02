package constructors;

public class Bus {

	Bus(){  // default constructor
		
	
		System.out.println("im in bus constructor");
		System.out.println("mileage of bus is" + mileage);
		data();
	
	}
	
	Bus(int i,String name){  // parameterised constructor
	System.out.println("im in parameterised constructor");
	
	}
	
	
	
	int mileage = 20;          // instance method
	
	void data() {      // non static method
//		Bus();      // cannot create constructor in the method 
		System.out.println("the data of the bus ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Bus();
		Bus b = new Bus();
		b.data();
		
		new Bus(23,"kaveri");
		
		

	}

}
