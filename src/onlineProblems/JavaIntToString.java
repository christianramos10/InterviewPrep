package onlineProblems;

import java.util.Scanner;

public class JavaIntToString {
	/*You are given an integer , you have to convert it into a string.
	Please complete the partially completed code in the editor. If your code successfully converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer".
	n can range between -100 to 100 inclusive.
 
 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		
		if(number >= -100 && number <= 100) {
			System.out.println("Good job");
		}
		else {
			System.out.println("Wrong answer");
		}
	}
}
