package interfacepack;

public class Child implements Interface1,Interface2,Interface3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Child C = new Child();
       C.m1();
       C.m2();
       C.m3();
		
       System.out.println(k);
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("hi iam M1 method from Interface1 implemented in concrete class");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("hi iam M2 method from Interface2 implemented in concrete class");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("hi iam M3 method from Interface3 implemented in concrete class");
		
	}

}
