package methodcategories;

public class MWORMWP3 {
	
	void Student(int stdid,String stdname,float stdmarks,boolean live,String address) {
		
	
		System.out.println("Is student still exists : " + live);

		System.out.println("sum of stdid and stdmarks " + (stdid+stdmarks));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MWORMWP3 M = new MWORMWP3();
		M.Student(12345, "krishna", 456f, true, "kphb");
		
	}

}
