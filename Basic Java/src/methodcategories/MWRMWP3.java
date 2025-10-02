package methodcategories;

public class MWRMWP3 {

	String Student(int stdid,String stdname,float stdmarks,boolean live,String address) {
		
	return stdid+stdname+stdmarks+live+address;
	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MWRMWP3 R = new MWRMWP3 ();
		System.out.println("the student details are"+R.Student(12345, "krishna", 456f, true, "kphb"));
		
		
	}

}
