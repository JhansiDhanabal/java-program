package quiz;

import java.util.Scanner;

public class InputFromUser {
	public static void main(String args[]) {
		Scanner o = new Scanner(System.in);
		System.out.println("Enter an integer : ");
		int num = o.nextInt();
		System.out.println("Entered number = "+num);
		o.close();
	}
}
