package methodoverriding;

public class Calf extends Cow{
	
	void name(int u) {
		System.out.println("Hai iam calf class");
		super.name(45);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calf L = new Calf();
		L.name(32);
	}

}
