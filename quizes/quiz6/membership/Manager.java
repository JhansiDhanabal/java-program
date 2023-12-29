package quiz;

public class Manager extends Member{
	String department;
	Manager(String name, int age,long phone,String address,double salary,String dept){
		super(name,age,phone,address,salary);
		this.department = dept;
	}
	public String toString() {
		return super.toString()+"\nDepartment : "+this.department;
	}
}
