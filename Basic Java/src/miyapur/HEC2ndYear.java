package miyapur;

public class HEC2ndYear {
	
void raghu() {
	byte age = 20;
	short height = 175;
	int rollnumber = 12345;
	long distancefromhousetocollege = 23445955L;
	float marks = 5.45664f;
	double percentage = 1245.53D;
	boolean present = true;
	char grade = 'B';
	String address="blr";
	System.out.println("hi all iam raghu method");
	
	String addres="mumbai";
	System.out.println(addres); // local variables
}

void  praveen() {
	byte age = 22;
	short height = 180;
	int rollnumber = 84534;
	long ageindays= 34455555L;
	float marks = 5.45664f;
	double percentage = 1245.53D;
	boolean absent = false;
	char grade = 'A';
	String address="hyd";
	System.out.println("hello all im praveen method");
}
 int attendance = 70;  // instance variables


public static void main(String[] args) {
	System.out.println("im in main method");
	System.out.println("today we dont have any rainfall");
	HEC2ndYear hec = new HEC2ndYear();
	hec.raghu();
	HEC2ndYear he = new HEC2ndYear();
	he.praveen();
	
	System.out.println(hec.attendance); // accessing instance variable
	
	
}
}
