package ArraysPack;

public class ArrayClass9 {

	public static void main(String[] args) {
		
		Object name[] = new Object[13];
		
		name[5] = -789;
		name[0] = "Jump";
		name[8] = true;
	    name[3] = "College";
	    name[10] = 54685F;
	    name[12] = "T";
	    
		System.out.println("the number of stored elements in the given array are" +name.length);
		
		for(int d=0;d<name.length;d++) {
			System.out.println(name[d]);
		}
		
		
	}

}
