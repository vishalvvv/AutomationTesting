package assignmentprograms;

public class Integerpositivenegativezero {

	public static void main(String[] args) {
		
		int num = 8;
		
		if(num>0) {
			if(num%3==0) {
				System.out.println("num is greater than zero and num is divisible by 3");
			}
			else {
				System.out.println("num is greater than zero and num is not divisible by 3");
			}
		}
		else	if(num<0) {
			System.out.println("num is less than zero");
		}
		 if(num==0){
			System.out.println("num is zero");
		}
	}

}
