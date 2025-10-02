package airport;

public class arrivals {

	 void terminal1() {
		 byte distance = 1;
		 short distmetres = 100;
		 int distcentimentres = 2000;
		 long distmillimetres = 50000000L;
		 float dismill = 2456778.f;
		 double dismil = 2576467D;
		 char c = 'T';
		 boolean v = false;
		 String term = "here is terminal 1";
		 System.out.println("im in terminal1");
	}
	 void terminal2() {
		 byte time = 25;
		 short timemin = 250;
		 int timesec = 25000;
		 long timemillisec = 3000000L;
		 float dismill = 2778f;
		 double dismil = 2576467D;
		 char c = 'F';
		 boolean w = true;
		 String term = "here is terminal 2";
		 
		System.out.println("im in terminal2");
		
		System.out.println(term); // local variable
	}
	 
	 int flighttime = 30;  // instance variable
	 
	 
	public static void main(String[] args) {
		System.out.println("im in airport");
		arrivals a = new arrivals();
		a.terminal1();
		arrivals at = new arrivals();
		at.terminal2();
	System.out.println(a.flighttime);   	
		
	}
}
