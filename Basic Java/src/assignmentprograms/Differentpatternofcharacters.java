package assignmentprograms;

public class Differentpatternofcharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int count =1;char c='A';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(c);
				count++;
				c++;
			}
			System.out.println();
		}
	}

}
