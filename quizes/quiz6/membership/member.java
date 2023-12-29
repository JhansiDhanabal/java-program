package quiz;

public class Member {
	String name;
	int age;
	long phonenumber;
	String Address;
	double salary;
	Member(String name, int age,long phone,String address,double salary){
		this.name = name;
		this.age = age;
		this.phonenumber = phone;
		this.Address = address;
		this.salary = salary;
	}
	public void printSalary() {
		System.out.println(this.salary);
	}
	public String toString() {
		return "Name : "+name+"\nAge : "+age+"\nPhone number : "+phonenumber+"\nAddress : "+Address+"\nSalary : "+salary;
	}
}
