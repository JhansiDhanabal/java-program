package quiz;

public class SavingsAccount extends Account{
	double interest_rate;
	SavingsAccount(String accno, double balance,double d) {
		super(accno, balance);
		this.interest_rate = d;
		// TODO Auto-generated constructor stub
	}
	public void calculateinterest() {
		double amount = balance*interest_rate/100;
		deposit(amount);
	}
}
