package superpackage;

public class Son extends Father {
	
	String sname ="Chick";
	
	void familydata() {
		String nname="Bird";
		System.out.println("The Father Name is : " + fname);
		System.out.println("The Father Name is : " + sname);
		System.out.println("The Father Name is : " + nname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Son S = new Son();
		S.familydata();
	}

}
