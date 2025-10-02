package defaultchecks;

public class StaticTrain {

	static String name;
	static int no;
	static char section;
	static boolean arrived;
	static float time;
	static long distance;
	
	static void data() {
		System.out.println("the name of the train is"+ name);
		System.out.println("the no of the train is"+ no);
		System.out.println("the section of the train is"+ section);
		System.out.println("the arrival of the train is"+ arrived);
		System.out.println("the time of the train is"+ time);
		System.out.println("the distance of the train is"+ distance);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          data();
	}

}
