package assignmentprograms;

public class PerfectSquare {

	public static void main(String[] args) {
		
		int num = 36;
		boolean perfectsquare = false;
		
		for(int i=1;i<=num/2;i++) {
			if(i*i == num) {
				perfectsquare = true;
				break;
			}
		}
		
		if(perfectsquare) {
			System.out.println(num +"is perfect square");
		}
		else {
			System.out.println(num +"is not perfect square");
		}
	}

}
