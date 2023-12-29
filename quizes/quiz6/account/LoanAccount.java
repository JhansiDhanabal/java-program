package quiz;

public class LoanAccount extends Account{
	double loan_rate;
	LoanAccount(String accno, double balance,double rate) {
		super(accno, balance);
		this.loan_rate = rate;
		// TODO Auto-generated constructor stub
	}
	public void calculateloan() {
		double amount = balance*loan_rate/100;
		withdraw(amount);
	}
}
