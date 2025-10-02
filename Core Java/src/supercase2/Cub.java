package supercase2;

public class Cub extends Lion {
	
	Cub(){
		System.out.println("Hai iam default child cub constructor");
	}
	
	void data() {
		// super();  // constructor call must be the first statement in a constructor
	}
	
	Cub(int k){
		this();
	//	super();
		System.out.println("Hai iam one int parameterised child cub constructor");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               new Cub(12345);
            
        
	}

}
