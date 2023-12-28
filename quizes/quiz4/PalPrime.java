package quiz;

import java.util.Scanner;

public class PalPrime {
	int num;
	String msg;
	PalPrime(int number, String message){
		this.num = number;
		this.msg = message;
		System.out.println(num+" is "+msg);
	}
	public static boolean isprime(int num) {
		if(num==1)
			return false;
		int i=2;
		while(i<=Math.sqrt(num)) {
			if(num%i==0)
				return false;
			i++;
		}
		return true;
	}
	public static boolean ispalindrome(int num) {
		String str1 = String.valueOf(num);
		StringBuilder input = new StringBuilder();
		input.append(str1);
		input.reverse();
		if(str1.equals(input.toString()))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = o.nextInt();
		System.out.println("Enter array[] : ");
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = o.nextInt();
		}
		for(int val:arr) {
			boolean flag1 = isprime(val);
			boolean flag2 = ispalindrome(val);
			if(flag1 && flag2)
				new PalPrime(val,"PalPrime");
			else if(flag1)
				new PalPrime(val,"Prime");
			else if(flag2)
				new PalPrime(val,"Palindrome");
			else
				new PalPrime(val,"neither prime nor palindrome");
		}
		o.close();

	}

}
