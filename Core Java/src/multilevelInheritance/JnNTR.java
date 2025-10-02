package multilevelInheritance;

public class JnNTR extends Harikrishna {
	
	void jntr() {
		System.out.println("Hai iam son of hari krishna");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         JnNTR J = new JnNTR();
         J.sntr();
         
         SnNTR S = new SnNTR();
         S.lakshmaiah();
	}

}
