package assignmentprograms;

public class Descendingordernumbers {
	
public static void main(String[] args) {
        
        int num1 = 7;
        int num2 = 2;
        int num3 = 10;
        
        int max, mid, min;
        
        if (num1 >= num2 && num1 >= num3) {
            max = num1;
            if (num2 >= num3) {
                mid = num2;
                min = num3;
            } else {
                mid = num3;
                min = num2;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            max = num2;
            if (num1 >= num3) {
                mid = num1;
                min = num3;
            } else {
                mid = num3;
                min = num1;
            }
        } else {
            max = num3;
            if (num1 >= num2) {
                mid = num1;
                min = num2;
            } else {
                mid = num2;
                min = num1;
            }
        }
        
        System.out.println(max + " " + mid + " " + min);
    }

}