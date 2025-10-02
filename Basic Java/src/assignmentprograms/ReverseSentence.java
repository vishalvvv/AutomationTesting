package assignmentprograms;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "today is a sunny day";
		
		String S[] = str.split(" ");
		
		for(int i = S.length - 1; i >= 0; i--) {
			System.out.print(S[i] + " ");
		}
		
	}

}
