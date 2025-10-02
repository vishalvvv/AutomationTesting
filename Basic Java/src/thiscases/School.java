package thiscases;

public class School {

	
	int x =1234;  // instance variable
	
	School(){
	int x =2344;
	int y = 3456;
	
	System.out.println("the value of x is"+x);
	System.out.println("the value of x is" + this.x);  // accessing instance variable using this keyword
	
this.data();  // accessing non static method inside constructor using this key words
	}
	
	void data() {

		System.out.println("the data of the school is" );
		System.out.println("the instance value of x is" + x);

	}
	
	School(String name,int pincode){
		this();   // calling default constructor using this
	}
	
	School(int pincode,String name,boolean yes){
		this("hps",459434);
		System.out.println("the school name is pincode, name,yes");
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new School();   // calling constructor in main method
		
		School h = new School();
		h.data();        // calling datamethod
		
		new School("narayana",23444);
	}

}
