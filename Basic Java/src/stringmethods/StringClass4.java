package stringmethods;

public class StringClass4 {

	public static void main(String[] args) {
		
		String S = "Today is Saturday and Tomorrow is Holiday";
		
		System.out.println("The number of Characters String S contains:" + S.length());
		
		
		for(int k=S.length()-1;k>=0;k--) {
		System.out.println(S.charAt(k));
		}

	}

}
