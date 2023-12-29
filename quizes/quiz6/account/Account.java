package quiz;

interface AbstractAccount {
	void deposit(double amount);
	void withdraw(double amount);
	double getbalance();
}
public class Account implements AbstractAccount{
	String acc_no;
	double balance;
	Account(String accno, double balance){
		this.acc_no = accno;
		this.balance = balance;
	}
	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		if(amount < 0)
			System.out.println("Invalid amount entered");
		else {
			balance += amount;
			System.out.println(getbalance());
		}
	}
	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount < 0 || amount>balance)
			System.out.println("Invalid amount entered");
		else{
			balance -= amount;
			System.out.println(getbalance());
		}
	}
	@Override
	public double getbalance() {
		// TODO Auto-generated method stub
		return balance;
	}
}
