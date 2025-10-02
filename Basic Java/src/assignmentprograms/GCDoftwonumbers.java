package assignmentprograms;

public class GCDoftwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 12,num2 =8 ,gcd=1;
		for(int i=1;i<=Math.min(num1, num2);i++) {
			if(num1%i==0 &&num2%i==0 ) {
				 gcd =i ;
				
			}
			
		}
		System.out.println(gcd);
	}

}
