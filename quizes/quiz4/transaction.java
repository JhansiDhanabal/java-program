/*
Create Account A and Account B with an initial balance of 5000 and 2500 respectively. Transfer amount of 1500 from Account A to B and an amount of 3000 from Account B to A. 

Print the receipt with the following details after each transaction  
 */
package quiz;

import java.util.Scanner;

public class transaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o = new Scanner(System.in);
		System.out.println("Enter account no 1, name :  ");
		long account1 = o.nextLong();
		String name1 = o.next();
		long balance1 = 5000;
		System.out.println("Enter account no 1, name :  ");
		long account2 = o.nextLong();
		String name2 = o.next();
		long balance2 = 2500;
		
		balance1 = balance1-1500;
		balance2 = balance2+1500;
		display_bill(account1,name1,balance1,account2,name2,balance2);
		balance2 -= 3000;
		balance1 += 3000;
		display_bill(account1,name1,balance1,account2,name2,balance2);
		
		o.close();
	}
	public static void display_bill(long acc1,String name1, long bal1, long acc2,String name2, long bal2) {
		System.out.println("Account id : "+acc1);
		System.out.println("Name : "+name1);
		System.out.println("Account Balance : "+bal1);
		System.out.println("Account id : "+acc2);
		System.out.println("Name : "+name2);
		System.out.println("Account Balance : "+bal2);
		System.out.println();
	}
}
