package assignmentprograms;

public class Primenumber {

	public static void main(String[] args) {
		
	int num = 5;
	
	boolean isPrime = true;
	
	if(num<2) {
		isPrime = false;
	}
	for(int i=2;i<num;i++) {
		if(num%i==0) {
			isPrime = false;
			break;
		}
	}
	if(isPrime) {
		System.out.println("number is prime number");
	}
	else {
		System.out.println("number is not a prime number");
	}
	}

}
