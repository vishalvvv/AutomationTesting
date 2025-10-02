package hyderabad;

public class library {

	void fictionbooks() {
		byte index = 10;
		short chapters = 100;
		int price = 1000;
		long pages = 4544339L;
		float pagenumber = 2.7f;
		double pagereference = 5657436D;
		char pagekeyword = 'S';
		String pagesentence = "iam in sentence";
		boolean open = true;
		System.out.println("im in fiction books");
	}
	void nonfictionbooks() {
		byte preface =1;
		short index =10;
		int price = 3000;
		long pages = 500000000L;
		float pagenumber = 2.7f;
		double pagereference = 5657436D;
		char pagekeyword = 'S';
		String pagesentence = "iam in sentence";
		boolean close = false;
		System.out.println("im in non fiction books");
	} 
	int booksquantity = 10; // instance variable
	void novels() {
		byte preface =1;
		short index =10;
		int price = 3000;
		long pages = 500000000L;
		float pagenumber = 2.7f;
		double pagereference = 5657436D;
		char pagekeyword = 'S';
		String pagesentence = "iam in sentence";
		System.out.println("im in novels");
		String pagechapters = "there are so many";    // local variable
		
		System.out.println(pagechapters);  // accessing local variable
	}
	public static void main(String[] args) {
		System.out.println("im in main method");
		library l = new library();
		l.fictionbooks();
		l.nonfictionbooks();
		l.novels();
		System.out.println(l.booksquantity);  // accessing instance variable
		
		
	}
	
	
}
