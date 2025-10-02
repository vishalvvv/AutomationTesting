package assignmentprograms;

public class Mwrwpso {
	
	String swapping(int a,int b) {
		
		a = a+b;
		b=a-b;
		a=a-b;
		
		return "the numbers after swapping are" + a+ "and" +b ;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mwrwpso  s = new Mwrwpso();
		System.out.println(s.swapping(3, 6));
	}

}
