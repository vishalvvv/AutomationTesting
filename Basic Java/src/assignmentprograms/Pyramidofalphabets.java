package assignmentprograms;

public class Pyramidofalphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='A';
		int count=c;
  for(int i=1;i<=7;i++) {
	  for(int j=1;j<=i;j++) {
		  if (count <= 'Z') {
		  System.out.print((char)count++);
	  }
	  }
	  if (count > 'Z') {
			break; 
		}
	  System.out.println();
	  
  }
	}

}
