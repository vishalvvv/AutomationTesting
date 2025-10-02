package stringmethods;

public class StringClass3 {

	public static void main(String[] args) {
		
		String S = "Today is Saturday and Tomorrow is Holiday";
		
		System.out.println("The number of Characters String S contains:" + S.length());
		
		
		for(int k=0;k<S.length();k++) {
		System.out.println(S.charAt(k));
		}

	}

}
