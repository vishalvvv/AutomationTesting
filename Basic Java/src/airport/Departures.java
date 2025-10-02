package airport;

public class Departures {
	
 void parking() {
	 byte distancekm = 10;
	 short distancemetres = 2345;
	 int distancemetre = 50000;
	 long distmillimetres = 234555555L;
	 float f = 12456775f;
	 Double d = 43556.43D;
	 char c = 'D';
	 String depar = "flight is going to depart";
	 boolean reach = true;
	System.out.println("im in parking");
 }
void bookingcounter() {
	byte ticketpriceinrrupee = 10;
	 short ticketpricepakistanrupee = 2345;
	 int usdollars = 50000;
	 long uaedinars = 234555555L;
	 char c = 'A';
	 Double d = 43556.43D;
	 char w = 'D';
	 boolean reach = false;;
	 String depar = "flight is going to depart";
	System.out.println("im in booking counter");
}
void securitychecks() {
	System.out.println("im in security checks");
}
public static void main(String[] args) {
	Departures d = new Departures();
	d.parking();
	System.out.println("flight is going to departure in 10 mins");
	Departures ds = new Departures();
	ds.bookingcounter();
}
}
