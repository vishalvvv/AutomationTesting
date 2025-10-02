package assignmentprograms;

public class Mwrwp {
	
	
	String employee(String id,String name, int age,String designation,String companyname,boolean present){

  return "the id of employee is" + id + "\n"+
		  "the name of the employee " + "is" +name + "\n"+
		  "the age of the employee is"+age + "\n"+
		  "the designation of the employee" + "is" + designation + "\n"+
		  "the employee is present " + present;
		
  
  
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mwrwp e = new Mwrwp();
		
		System.out.println("the employee data is" + e.employee("102","jennifer",24,"qa engineer","walmart",false));
	}

}
