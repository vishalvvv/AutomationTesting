package assignmentprograms;

public class UsernamePassword {

	public static void main(String[] args) {
		
		String enteredusername="vishal",enteredpassword="vishal";
		
		String storedusername = "vishal" , storedpassword = "vishal1";
		
		if(enteredusername.equals(storedusername) && enteredpassword.equals(storedpassword)) {
			System.out.println("access granted");
		}
		else if(enteredusername.equals(storedusername) && !enteredpassword.equals(storedpassword)) {
			System.out.println("incorrect password");
		}
		else if(!enteredusername.equals(storedusername)) {
			System.out.println("invalid username");
		}
		

	}

}
