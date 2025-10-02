package defaultchecks;

public class InstanceTrain {

	String name;
	int no;
	char section;
	boolean arrived;
	float time;
	long distance;
	
	void data() {
		System.out.println("the name of the train is"+ name);
		System.out.println("the no of the train is"+ no);
		System.out.println("the section of the train is"+ section);
		System.out.println("the arrival of the train is"+ arrived);
		System.out.println("the time of the train is"+ time);
		System.out.println("the distance of the train is"+ distance);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstanceTrain it = new InstanceTrain();
	   it.data();
		
	}

}
