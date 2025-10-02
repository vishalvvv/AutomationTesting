package methodoverloading;

public class Colors {
	
	void colorname() {
		System.out.println("Hi Iam method color name");
	}
	
	void colorname(int k) {
		System.out.println("The Number of Black Color Boxes are: "+k);
	}
	
	void colorname(boolean p) {
		System.out.println("Is color is navy blue: "+p);
	}
	
	void colorname(String a,int f) {
		System.out.println("The favourite color is "+a);
	}
	
	void colorname(int d,String e) {
		System.out.println("The Yellow color box cost is: "+d);
	}
	
	void colorname(boolean h,String u,int j) {
		System.out.println("The color mix colors becomes out color as: "+u);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Colors V = new Colors();
		V.colorname(false,"Brown",45);
		V.colorname(56,"Blue");
	}

}
