package stringmethods;

public class StringClass8 {

	public static void main(String[] args) {
		
		String S1 = "Today ";
		String S2 = "is ";
		String S3 = S1.concat(S2);
		String S4 = S3.concat("Saturday ").concat("and ");
		String S5 = "Classes are running and".concat(S4);
		
		System.out.println(S5);
		
		System.out.println(S5.contains("ar"));
		
		System.out.println(S5.contains("are running"));
	
		

	}

}
