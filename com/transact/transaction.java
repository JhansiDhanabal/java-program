package com.transact;
import java.util.Scanner;
public class transaction {
    public double balance;
    public transaction(double balance)
    {
        this.balance=balance;
    }
    public static double credit()
    {
        Scanner o=new Scanner(System.in);
        System.out.println("enter amount you want to deposit:");
        double amt=o.nextDouble();
        return amt;
    }
    public static double debit()
    {
        Scanner o=new Scanner(System.in);
        System.out.println("enter amount you want to withdraw:");
        double amt=o.nextDouble();
        return amt;
    }
}
