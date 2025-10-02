package thisImportant;

public class King {
	
	void dragon() {
		System.out.println("--------Hai Iam Dragon Method");
	}
	
	String H = "Heights";
	
	King(){
		System.out.println("--------Hai Iam Default Constructor");
		this.dragon();
		System.out.println("Here H stands for " + this.H);
	}
	
	void orange() {
		System.out.println("----Hai I am Orange Method--------");
		System.out.println("Here H stands for in the method is" +this.H);
		this.dragon();
	}

	public static void main(String[] args) {
		
	King K =new King();
	
	System.out.println("----------------------------------------");
	
	K.orange();

	}

}
