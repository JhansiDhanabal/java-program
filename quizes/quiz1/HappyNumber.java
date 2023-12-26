package quiz;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = o.nextInt();
		int orginal = n;
		int loop=0;int num;int rem;
		while(loop<Integer.MAX_VALUE && n!=1) {
			loop++;
			num = n;n=0;
			while(num>0) {
				rem = num%10;
				n += rem*rem;
				num = num/10;
			}
		}
		if(n==1)
			System.out.println(orginal + " is a happy number");
		else
			System.out.println(orginal + " is not a happy number");
		o.close();
	}

}
