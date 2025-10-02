package secunderabad;

public class railwaystation {

	void platform1() {
		byte distance= 1;
		short traintime = 30;
		int steps = 300;
		long elevators = 50000L;
		float dista = 4577.43f;
		double dist = 3454644.D;
		char plat = 'W';
		boolean b = true;
		String platform = "it is open";
		System.out.println("im in platform1");
	}
	
     int time =30; // instance variable 
     
	void platform2() {
		byte distance =2;
		short traintime = 30;
		int steps = 300;
		long elevators = 50000L;
		float dista = 4577.43f;
		double dist = 3454644.D;
		char plat = 'W';
		boolean b = false;
		String platform = "it is open";
		System.out.println("train arrives at platform2");
	}
	void ticketcounter() {
		byte ticketpages =2;
		short ticketparagraph = 500;
		int ticketsentences = 20000;
		long ticketalphabets = 49543394L;
		System.out.println("ticket counter is open");
		boolean counterclosed = true; // local variable
		System.out.println(counterclosed);
	}
	public static void main(String[] args) {
		System.out.println("im in railway station");
		railwaystation rs = new railwaystation();
		rs.platform1();
		rs.platform2();
		rs.ticketcounter();
		System.out.println(rs.time);  // instance variable
		
	}
}
