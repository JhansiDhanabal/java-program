package quiz;

public class Employee extends Member{
	String specialization;
	Employee(String name, int age,long phone,String address,double salary,String specialization){
		super(name,age,phone,address,salary);
		this.specialization = specialization;
	}
	public String toString() {
		return super.toString()+"\nSpecialization : "+this.specialization;
	}
}
