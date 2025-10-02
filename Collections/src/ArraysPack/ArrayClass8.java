package ArraysPack;

public class ArrayClass8 {

	public static void main(String[] args) {
		
		String name[] = new String[13];
		
		name[5] = "-789";
		name[0] = "Jump";
		name[8] = "Yes";
	    name[3] = "College";
	    name[10] = "ink";
	    
		System.out.println("the number of stored elements in the given array are" +name.length);
		
		for(int d=0;d<name.length;d++) {
			System.out.println(name[d]);
		}
		
		
	}

}
