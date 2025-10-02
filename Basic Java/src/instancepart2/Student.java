package instancepart2;

public class Student {
	
	int stdid;
	String stdname;
	String stdaddress;
	
	void studentdata() {
		System.out.println("The Student Id is: " +stdid);
		System.out.println("The Student Name is: " +stdname);
		System.out.println("The Student  is from : " +stdaddress);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("------------with s as object without any value ----------------");
   Student s = new Student();
    s.studentdata();
    
    System.out.println("...............with s1 as student1 with data-------------------");
    Student s1 = new Student();
       s1.stdid = 60;
    s1.stdname="sunitha";
    s1.stdaddress="karachi";
    s1.studentdata();

    System.out.println("...............with s2 as student2 with data-------------------");
    Student s2 = new Student();
    s2.stdid = 30;
  s2.stdname="anitha";
  s2.stdaddress="delhi";
   s2.studentdata();
   
   
   System.out.println("...............with s3 as student3 with data-------------------");
   Student s3 = new Student();
   s3.stdid = 21;
 s3.stdname="tulasi";
 s3.stdaddress="gujarat";
  s3.studentdata();
  
  System.out.println("------here  s2 student name wants to change from anitha to anitha kapoor");
  
  s2.stdname="anitha kapoor";
  
  System.out.println("------After s2 student name change----------");
  
  s1.studentdata();
  s2.studentdata();
  s3.studentdata();
   
    
}

}
