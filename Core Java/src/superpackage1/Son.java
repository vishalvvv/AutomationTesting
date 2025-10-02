package superpackage1;

public class Son extends Father {
	
	String name ="Chick";
	
	void familydata() {
		String name="Bird";
		System.out.println("The Father Name is : " + super.name);
		System.out.println("The Father Name is : " + this.name);
		System.out.println("The Father Name is : " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Son S = new Son();
		S.familydata();
	}

}
