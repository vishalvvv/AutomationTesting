package assignmentprograms;

public class Mwrwopaiv {

	int id = 6547;
	int age = 30;
	String name = "messi";
	String club="barcelona";
	
	
	String footballplayers() {
		
		return "the footballer id is" + id + "\n" 
		+ "the footballer age is" + age + "\n" 
				+ "footballer name is " + name +"\n"
		+ "the footballer club is" + club;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mwrwopaiv f = new Mwrwopaiv();

		System.out.println("the footballer details are "+ f.footballplayers());
	}

}
