package instancepart2;

public class Customer {
	
	int customerid;
	String customername;
	String address;
	long mobilenumber;
	
	
	void data() {
		System.out.println("the customer id is " + customerid);
		System.out.println("the customer name is " + customername);
		System.out.println("the customer address is " + address);
		System.out.println("the customer mobile number is " + mobilenumber);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Customer c = new Customer();
   c.data();
   
   
   
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
   
   
   c2.customername="sathi";
   c2.address="manali";
   c2.data();
   
   c1.data();
		
	}

}
