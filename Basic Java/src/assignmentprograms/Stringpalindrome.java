package assignmentprograms;

public class Stringpalindrome {

	public static void main(String[] args) {
		
		 String str1 = "bob";
		 
		 int i=0,j =str1.length()-1;
		 
		 boolean palindrome = true;
		 
		 while(i<j) {
			 
			 if(str1.charAt(i)!=str1.charAt(j)) {
				 palindrome = false;
				 break;
			 }
			 i++;
			 j--;
			 }
		 if(palindrome) {
			 System.out.println("It is a palindrome");
		 }
		 else {
			 System.out.println("not a palindrome");
		 }
		 }
}
	


