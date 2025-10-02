package withoutinheritance;

public class MainBranch {

	public static void main(String[] args) {
		
		System.out.println("--------Abids school data-----");
		AbidsSchool A = new AbidsSchool();
		A.stdcount = 456;
		A.staffcount = 14;
		A.address = "Near Temple";
		A.pincode = 100012;
		A.schooldata();


		System.out.println("--------Hydernagar school data-----");
		HyderNagarSchool H = new HyderNagarSchool();
		H.stdcount = 123;
		H.staffcount = 16;
		H.address = "beside post office";
		H.pincode = 400074;
		H.schooldata();

		
		
		
		
		
	}

}
