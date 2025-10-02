package multilevelInheritance;

public class ClassC extends ClassB {

	void C() {
		System.out.println("im in c method");
	}
	
	public static void main(String[] args) {
	ClassC c = new ClassC();
	c.C();
	c.B();
	c.C();
	
	ClassB b = new ClassB();
	b.A();
	b.B();
	
	
	}
}
