package quiz;

import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o = new Scanner(System.in);
		System.out.println("Enter two floating numbers : ");
		float a = o.nextFloat();
		float b = o.nextFloat();
		float avg = (a+b)/2;
		System.out.printf("Average = %.2f",avg);
		o.close();
	}

}
