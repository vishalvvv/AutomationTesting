package ArraysPack;

public class ArrayClass4 {

	public static void main(String[] args) {
		
		int [] marks = new int[11];
		
		marks[5] = -789;
		
		marks[0] = 453;
		
		marks[8] = 86546;
		
		marks[3] = 3251;
		
		// marks[11] = -100; error - array index out of bounds exception
		marks[10] = -100;
	
		System.out.println(marks[0]);
		System.out.println(marks[3]);
		System.out.println(marks[5]);
		System.out.println(marks[7]);
		System.out.println(marks[8]);
		System.out.println(marks[10]);
		
	}

}
