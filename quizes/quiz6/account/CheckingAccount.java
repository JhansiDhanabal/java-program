package quiz;

public class CheckingAccount extends Account{

	double minimum_balance;
	CheckingAccount(String accno, double balance,double minimum) {
		super(accno, balance);
		// TODO Auto-generated constructor stub
		this.minimum_balance = minimum;
	}
	public void withdraw(double amount) {
		if(amount<0 || (balance-amount)< this.minimum_balance) {
			System.out.println("Invalid amount entered");
		}
		else {
			super.withdraw(amount);
		}
	}

}
