package constructors;

public class Animals {
	
	Animals(){
		System.out.println("-----------Hai I am Default Constructor--------------");
	}

	public static void main(String[] args) {
		
		new Animals(4);
		new Animals("Calf",5678765);
		new Animals();

	}
	
	Animals(String h){
		System.out.println("Hai Iam king of the forest and my name is: "+h);
	}
	
	Animals(int k){
		System.out.println("Hai Iam an Animal and my name is: "+k);
	}
	

	Animals(int i,String u){
		System.out.println("The kids I have are: "+i);
	}
	
	Animals(String a,int b){
		System.out.println("My kid name is : "+a);
	}
	
	

}
