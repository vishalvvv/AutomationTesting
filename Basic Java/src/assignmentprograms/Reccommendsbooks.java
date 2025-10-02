package assignmentprograms;

import java.util.Scanner;
public class Reccommendsbooks {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		String genre = s.next();
		
		if(genre.equalsIgnoreCase("Adventure") || genre.equalsIgnoreCase("Romance")|| genre.equalsIgnoreCase("science fiction")) {
			System.out.println("you have to read books" + genre);
		}

	}

}
