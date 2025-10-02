package stringmethods;

public class StringClass10 {

	public static void main(String[] args) {
		
		String S1 = "Today is Not Holiday ";
		String S2 = "Today is not Holiday ";
		String S3 = "Today is Not Holiday ";
		String S4 = "today is Not Holiday ";
		
		System.out.println("S1 checks with S2: " +S1.equals(S2));
		
		System.out.println("S1 checks with S3: " +S1.equals(S3));
		
		System.out.println("S1 checks with S4: " +S1.equals(S4));
		
		System.out.println("S1 checks with S2 without case sensitive : " +S1.equalsIgnoreCase(S2));
		
		System.out.println("S3 checks with S4 without case sensitive : " +S3.equalsIgnoreCase(S4));
		
	
		

	}

}
