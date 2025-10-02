package assignmentprograms;

public class Numberoffibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int low = 10,high = 50;
		int a=0,b=1;
		int count =0;
		while (true) {
			int c = a + b;
			if (c > high) {
				break; // stop when c exceeds the range
			}
			if (c >= low) {
				System.out.println(c);
				count++;
			}
			a = b;
			b = c;
		}

		System.out.println(count);
		
	}

}
