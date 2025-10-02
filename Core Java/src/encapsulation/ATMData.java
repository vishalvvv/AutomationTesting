package encapsulation;

public class ATMData {
	
	private int pin;
   private String name;
	private int amount;
	
	void setpin(int userpin) {  // userpin - 6789
		pin = userpin;
	}
	
	int getpin() {
		return pin;
	}
	
	void setname(String username) {
		name = username;
	}
	
	String getname() {
		return name;
	}
	
	void setamount(int useramount) {
		amount = useramount;
	}
	
	int getamount() {
		return amount;
	}
	

}
