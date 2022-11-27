package com.loan;
import com.transact.transaction;
import static com.transact.transaction.*;
import java.util.Scanner;
public class loanaccount {
    String accno;
    String name;
    Double balance;
    public loanaccount(String accno,String name,Double balance)
    {
        this.accno=accno;
        this.name=name;
        this.balance=balance;
    }
    public void dotransaction(){
        transaction o=new transaction(balance);
        System.out.println("1.credit");
        System.out.println("2.debit");
        System.out.println("3.exit");
        Scanner os=new Scanner(System.in);
        int j=1;
        while(j==1)
        {
            System.out.println("enter your choice:");
            int ch=os.nextInt();
        switch(ch)
        {
            case 1:
            {
                double credit=credit();
                System.out.println("credit amount:"+credit);
                balance=balance+credit;
                System.out.println("Total balance:"+balance);
                break;
            }
            case 2:
            {
                double debit=debit();
                if(balance>=debit)
                {
                    System.out.println("debit amount:"+debit);
                    balance=balance-debit;
                    System.out.println("Total balance:"+balance);
                }
                else
                {
                    System.out.println("you balance is less than "+debit+" Transaction failed");
                }
                break;
            }
            case 3:
            {
                j=0;
                break;
            }
        }
        }
        
    }
}
