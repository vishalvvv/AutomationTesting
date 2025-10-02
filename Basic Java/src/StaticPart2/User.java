package StaticPart2;

public class User {

	static String gender = "male";
	
	int userid;
	String username;
	String useraddress;
	String usercourse;
	
	
	void data() {
		System.out.println("the user gender is" + gender);
		System.out.println("the user id is" + userid);
		System.out.println("the user name is" + username);
		System.out.println("the user address is"+useraddress);
		System.out.println("the user course is" + usercourse);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(gender);
		
		User u = new User();
		u.data();
		
		System.out.println("---------------------------------------------");
		
		
		User u1 = new User();
		u1.userid=201;
		u1.username="balaram";
		u1.useraddress="bangalore";
		u1.usercourse="react js";
		
		u1.data();
		
		System.out.println("---------------------------------------");
		User u2 = new User();
		u2.userid=301;
		u2.username="sita";
		u2.useraddress="nepal";
		
		
		System.out.println(gender);
		 gender = "female";
	System.out.println(gender);
	
	u.data();
	
	u2.data();
	
	u1.data();
	
	
		
	}

}
