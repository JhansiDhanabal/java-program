package common;
import com.loan.loanaccount;
public class loantransaction {
    public static void main(String[] args) {
        String name=args[0];
        String accno=args[1];
        Double balance=Double.parseDouble(args[2]);
        System.out.println("CUSTOMER NAME:"+name);
        System.out.println("ACCOUNT NUMBER:"+accno);
        loanaccount obj=new loanaccount(name,accno,balance);
        obj.dotransaction();
    } 
}
