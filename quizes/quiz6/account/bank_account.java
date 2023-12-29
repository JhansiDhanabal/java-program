package quiz;

public class bank_account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount acc1 = new SavingsAccount("8713487654565",2000,2.3);
		System.out.println(acc1.getbalance());
		CheckingAccount acc2 = new CheckingAccount(acc1.acc_no,acc1.balance,1000);
		acc2.withdraw(5000);
		LoanAccount acc3 = new LoanAccount(acc1.acc_no,acc1.balance,3.9);
		acc3.calculateloan();
		acc3.getbalance();
	}

}
