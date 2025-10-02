package nexusmall;

public class Pvrcinemas {

	void screen1() {
		byte screensize = 50;
		short screenheight = 5000;
		int screenwidth = 35000;
		long screenshows = 5000000L;
		float screendiamter = 3.567754f;
		double screencircumference = 466574433D;
		char screencode = 's';
		String screenmovie = "madmax is playing now";
		boolean f = true;
		System.out.println("im in screen1");
	}
	void entrance() {
		byte entrancedistance = 5;
		short entrancesteps = 200;
		int entranceelevators = 2000;
		long entrancefloors = 50000L;
		float sentrancediamter = 3.567754f;
		double entrancecircumference = 466574433D;
		char entrancecode = 'V';
		String entrancemovie = "entry is open for cars";
		boolean r = false;
		System.out.println("im in entrance");
	}
	void eatery() {
		byte waterbottleprice = 30;
		short icecreamprice = 400;
		int chineseprice = 5000;
		long continentalprice = 434559L;
		System.out.println("im in food section");
		float mexicanprice = 45664.4f;      // declaring local variable
		System.out.println(mexicanprice);  // accessing local variable
	}
	
	int foodprice = 354;  // instance variable
	
	public static void main(String[] args) {
		System.out.println("im in ticket counter");
		
		Pvrcinemas pvr = new Pvrcinemas();
		pvr.screen1();
		pvr.entrance();
		pvr.eatery();
		
		System.out.println(pvr.foodprice); // accessing instance variable
		
	}
}
