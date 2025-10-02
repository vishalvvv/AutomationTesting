package assignmentprograms;

public class SwappingNumbersWithoutusingthird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10,b=20;
		
		a = a+b;  // 10+20 = 30 ,a = 30
		b = a-b;  // 30-20=10, b = 10
		a = a-b; // 30-10=20, a = 20
		
		System.out.println("numbers after swapping" + a + "and" +b);

	}

}
