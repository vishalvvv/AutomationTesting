package stringmethods;

public class Assignment {

	public static void main(String[] args) {
		
		String U = "My password is ^&^%*&) (*4708-0 and my username is hello5634";
		
		String R =  U.replaceAll("\\d", "");
		
		System.out.println(R);
		
		 String s =  U.replaceAll("[^a-zA-Z0-9]" , "");
		
		 System.out.println(s);
		 
		 String ns = U.replaceAll("[^a-zA-Z\\s]", "");
		 System.out.println(ns);
		 
	 String reverse[] = ns.split("\\s");
		 
	 for(int i=0;i<reverse.length;i++) {
		 
		 String word = reverse[i];
			String reversedword = "";
			for (int j = word.length() - 1; j >= 0; j--) {
			    reversedword = reversedword + word.charAt(j);
			}
			System.out.print(reversedword+" ");
		 }
	 
	 String Ca = "My password is ^&^%*&) (*4708-0 and my username is hello5634";
	 String countedChars = "";

	 for (int i = 0; i < Ca.length(); i++) {
	     char ch = Ca.charAt(i);

	     if (countedChars.indexOf(ch) == -1) {
	         int count = 0;

	         for (int j = 0; j < Ca.length(); j++) {
	             if (Ca.charAt(j) == ch) {
	                 count++;
	             }
	         }

	         System.out.println("Character '" + ch + "' appears " + count + " times");
	         countedChars += ch;
	     }
	 }
	}
}
	 
