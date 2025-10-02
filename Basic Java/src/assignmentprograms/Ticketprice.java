package assignmentprograms;

public class Ticketprice {

	public static void main(String[] args) {
		
		
		int age = 10,height=3;
		
		if(age<10 && height<3) {
			System.out.println("ticket price is 8 $");
		}
			else if(age<10 && height>=3) {
				System.out.println("ticket price is 12 $");
			}
		
		else if (age>=10 && height>=3){
			System.out.println("ticket price is 18 $");
		}
}
	

}
