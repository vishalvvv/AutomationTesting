package abstractionpack;

public class MyCarData extends CarData{  // tomorrow after buying car

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCarData M = new MyCarData();
	 M.tyres();
	 M.fuel();
	 M.model();
		M.color();
		

	}

@Override
void color() {
	// TODO Auto-generated method stub
	System.out.println("my car color is black");
	
}

@Override
void fuel() {
	// TODO Auto-generated method stub
	System.out.println("fuel used for my car is petrol");
}

@Override
void model() {
	// TODO Auto-generated method stub
	System.out.println("my car model is top end");
}

}
