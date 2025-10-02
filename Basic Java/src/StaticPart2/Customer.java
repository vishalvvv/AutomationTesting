package StaticPart2;



public class Customer {
	
	int customerid;
	String customername;
	String address;
	long mobilenumber;
	static String gender;
	
	
	void data() {
		System.out.println("the customer id is " + customerid);
		System.out.println("the customer name is " + customername);
		System.out.println("the customer address is " + address);
		System.out.println("the customer mobile number is " + mobilenumber);
		System.out.println("the customer gender is"+ gender);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Customer c = new Customer();
		   c.data();
		   
		   gender = "female";
		   
		   Customer c1 = new Customer();
		   c1.customerid=632;
		   c1.customername="durga";
		   c1.address="kolkata";
		   c1.mobilenumber=4521377648L;
		   c1.data();
		   
		   
		   Customer c2 = new Customer();
		   c2.customerid=236;
		   c2.customername="parvathi";
		   c2.address="shimla";
		   c2.mobilenumber=756978820L;
		   c2.data();
		   
		   
		   System.out.println("----------------after changing data-----------------------------------");
		   
		   gender = "male";
		   
		   c1.data();
		   c2.data();

	}

}
