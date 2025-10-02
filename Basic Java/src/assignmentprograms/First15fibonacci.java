package assignmentprograms;

public class First15fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a=0,b=1;
 
 System.out.println(a);
 System.out.println(b);


for(int i=3;i<=15;i++)	{
	int c = a+b;
	System.out.println(c);
	a=b;
	b=c;
}
	}

}
