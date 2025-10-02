package StaticPart2;

public class Student {
	
	int stdid;
	String stdname;
	String stdaddress;
	static String  stdcourse;
	
	void studentdata() {
		System.out.println("The Student Id is: " +stdid);
		System.out.println("The Student Name is: " +stdname);
		System.out.println("The Student  is from : " +stdaddress);
		System.out.println("The Student  opted course is : " +stdcourse);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("------------with s as object without any value ----------------");
		Student S = new Student();
		S.studentdata();
		
		stdcourse = "Manual Testing";
		
		
		System.out.println("------------with s1 as student1 with data----------------");
		Student S1 = new Student();
		
		S1.stdid = 56;
		S1.stdname="lavanya";
		S1.stdaddress="sr nagar";
		S1.studentdata();
		
		
		System.out.println("------------with s2 as student2 with data----------------");
		Student S2 = new Student();
		
		S2.stdid = 42;
		S2.stdname="anil";
		S2.stdaddress="saroor nagar";
		S2.studentdata();
		
		System.out.println("------------with s3 as student3 with data----------------");
		Student S3 = new Student();
		
		S3.stdid = 35;
		S3.stdname="jackie";
		S3.stdaddress="lajpat nagar";
		S3.studentdata();
		
		
	System.out.println("------here  s3 student name wants to change from manual testing to selenium with java ");
	
	S3.stdcourse = "Selenium with java";
	
	
	System.out.println("------after  s3 student course change---");
	
	S1.studentdata();
	S2.studentdata();
	S3.studentdata();
	
	
	
	
		
	}

}
