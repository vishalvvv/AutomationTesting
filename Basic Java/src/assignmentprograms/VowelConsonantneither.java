package assignmentprograms;

public class VowelConsonantneither {

	public static void main(String[] args) {
	
		
     char c = 'f';
		
       if ((c >= 'a' && c <= 'z')) {
    	   
       
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
			System.out.println("vowel");
		}
		else  {
			System.out.println("consonant");
		}
       }
		else {
			System.out.println("neither vowel nor consonant");
		}
	}

}
