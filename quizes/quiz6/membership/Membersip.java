package quiz;

import java.util.Scanner;

public class Membership {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o = new Scanner(System.in);
		System.out.println("Manager details");
		System.out.print("Name : ");
		String name = o.nextLine();
		System.out.print("Age : ");
		int age = o.nextInt();
		System.out.print("Phone : ");
		long phone = o.nextLong();
		o.nextLine();
		System.out.print("Address : ");
		String address = o.nextLine();
		System.out.print("Salary :");
		double salary = o.nextDouble();
		System.out.print("Department : ");
		String dept = o.next();
		Manager manager = new Manager(name,age,phone,address,salary,dept);
		System.out.println("Enter number of employee : ");
		int n = o.nextInt();
		Employee emp[] = new Employee[n];
		String specialization;
		for(int i=0;i<n;i++) {
			System.out.println("Enter employee "+(i+1)+" details");
			o.nextLine();
			System.out.print("Name : ");
			name = o.nextLine();
			System.out.print("Age : ");
			age = o.nextInt();
			System.out.print("Phone : ");
			phone = o.nextLong();
			o.nextLine();
			System.out.print("Address : ");
			address = o.nextLine();
			System.out.print("Salary :");
			salary = o.nextDouble();
			System.out.print("Specialization : ");
			specialization = o.next();
			emp[i] = new Employee(name,age,phone,address,salary,specialization);
		}
		
		System.out.println("\n\n				Company Members Details");
		System.out.println("\n\n				Manage Details");
		System.out.println(manager);
		System.out.println("\n\n				Employee Details");
		for(int i=0;i<n;i++) {
			System.out.println("\nEmployee "+(i+1)+" Details : ");
			System.out.println(emp[i]);
		}
		o.close();
	}

}
