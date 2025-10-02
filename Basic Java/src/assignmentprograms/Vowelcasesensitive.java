package assignmentprograms;

public class Vowelcasesensitive {

	public static void main(String[] args) {
		
		char ch='E';
		
		char c = Character.toLowerCase(ch);
		
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
			System.out.println("it is vowel");
		}
		else {
			System.out.println("it is not vowel");
		}

	}

}
