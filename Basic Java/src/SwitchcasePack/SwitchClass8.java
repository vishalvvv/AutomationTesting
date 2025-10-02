package SwitchcasePack;

public class SwitchClass8 {

	public static void main(String[] args) {
		
	String m = "Good";
	
	switch(m) {
	default: System.out.println("entered month code is incorrect");
	break;
	
	case "Apr": System.out.println("Month is April");
	          //  break;
	case "Nov": System.out.println("Month is November");
  //  break;
	case "Sep": System.out.println("Month is September");
   // break;
	case "Jan": System.out.println("Month is January");
  //   break;  -- fall through
	case "My": System.out.println("Month is May");
    // break;
	case "Dec": System.out.println("Month is December");
    // break;
	case "Jul": System.out.println("Month is July");
    break;
	case "Feb": System.out.println("Month is February");
    break;
	case "Oct": System.out.println("Month is October");
    break;
	case "Aug": System.out.println("Month is August");
    break;
	case "Jun": System.out.println("Month is June");
    break;
	case "Mar": System.out.println("Month is March");
    break;
	
		
	
	}

	}

}
