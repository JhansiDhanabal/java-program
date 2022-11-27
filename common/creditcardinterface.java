package common;
import java.util.*;
public class creditcardinterface {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        System.out.println("enter number of customer:");
        int n=o.nextInt();
        customer obj[] = new customer[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter customer name:");
            String na=o.next();
            System.out.println("enter card no:");
            int cn=o.nextInt();
            System.out.println("enter pin number:");
            int pin=o.nextInt();
            System.out.println("enter amount:");
            int amt=o.nextInt();
            obj[i]=new customer(na,cn,pin,amt);
            System.out.println("- - - - - - - -");
            obj[i].viewcreditamount();
            obj[i].viewpin();
            System.out.println("- - - - - - - -");
            obj[i].changepin();
            System.out.println("- - - - - - - -");
            System.out.println("enter amount:");
            int pa=o.nextInt();
            obj[i].paybalance(pa);
            System.out.println(obj[i]);
            System.out.println();

        }
    }
    
}
interface credit_card_interface
{
    void viewcreditamount();
    void viewpin();
    void changepin();
    void paybalance(int pay);
}
class customer implements credit_card_interface
{
    String name;
    int cardno;
    int pin;
    int creditamount=0;
    customer(String na,int card,int p,int credit)
    {
        name=na;
        cardno=card;
        pin=p;
        creditamount=credit;
    }
    @Override
    public void viewcreditamount()
    {
        System.out.println("credit amount = "+creditamount);
    }
    @Override
    public void viewpin()
    {
        System.out.println("pin = "+pin);
    }
    @Override
    public void changepin()
    {
        System.out.println("current pin number = "+pin);
        Scanner o=new Scanner(System.in);
        System.out.println("enter new pin number:");
        int n=o.nextInt();
        pin=n;
    }
    @Override
    public void paybalance(int pay)
    {
        if(creditamount!=0)
        {
            creditamount=creditamount-pay;
            System.out.println("Balance = "+creditamount);
        }
        else
        {
            System.out.println("All credits are cleared");
        }
    }
    @Override
    public String toString()
    {
        return "name = "+name+" card no = "+cardno+" pin = "+pin+" balance = "+creditamount;
    }
}