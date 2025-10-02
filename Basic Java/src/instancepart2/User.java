package instancepart2;

public class User {
	
	int userid;
	String username;
	String address;
	String course;
	
	
	void data() {
		System.out.println("the user id is:" + userid);
		System.out.println("the user name is:" + username);
		System.out.println("the user address is:" + address);
		System.out.println("the user course is:" + course);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User u = new User();
		u.data();
		
		System.out.println("----------------------------");
		
		
		User u1 = new User();
		u1.userid = 101;
		u1.username="krishna";
		u1.address="hyd";
		u1.course="java";
		u1.data();
		
		System.out.println("---------------------------");
		
		User u2 = new User();
		u2.userid=102;
		u2.username="shiva";
		u2.address="mumbai";
		u2.course="manual testing";
		u2.data();
		
		
		u2.course= "devops";
		u2.data();
		
	}

}
