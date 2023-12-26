package quiz;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		double a = o.nextDouble();
		double b = o.nextDouble();
		System.out.println("Enter operator : ");
		char ch = o.next().charAt(0);
		try {
			if(ch=='+')
				System.out.printf("Addition = %.2f",a+b);
			else if(ch=='-')
				System.out.printf("Subtraction = %.2f",a-b);
			else if(ch == '*')
				System.out.printf("Multiplication = %.2f",a*b);
			else if(ch == '/')
				System.out.printf("Division = %.2f",a/b);
			else
				System.out.println("Invalid operator");
		}
		catch(Exception e){
			System.out.println(e);
		}
		o.close();
	}

}
