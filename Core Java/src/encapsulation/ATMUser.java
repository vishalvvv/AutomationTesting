package encapsulation;

public class ATMUser {

	public static void main(String[] args) {
		
		ATMData A = new ATMData();
		A.setpin(112244);
		System.out.println(A.getpin());
		A.setname("shankar");
		System.out.println(A.getname());
		A.setamount(25000);
		System.out.println(A.getamount());

	}

}
