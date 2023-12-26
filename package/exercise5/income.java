/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise5;

/**
 *
 * @author USER
 */
public class income extends employee{
    public double tax;
    public double amt;
    public double taxpercentage()
    {
        if(basic_pay<=190000)
        {
            if(category.equals("M"))
            {
                tax=0;
                System.out.println("tax percentage-"+tax);
            }
            else
            {
                tax=0;
                System.out.println("tax percentage-"+tax);
            }
        }
        else if(basic_pay<=200000)
        {
            if(category.equals("M"))
            {
                tax=10;
                System.out.println("tax percentage-"+tax);
            }
            else
            {
                tax=0;
                System.out.println("tax percentage-"+tax);
            }
        }
        else if(basic_pay<500000)
        {
            if(category.equals("M"))
            {
                tax=20;
                System.out.println("tax percentage-"+tax);
            }
            else
            {
                tax=10;
                System.out.println("tax percentage-"+tax);
            }
        }
        else
        {
            if(category.equals("M"))
            {
                tax=25;
                System.out.println("tax percentage-"+tax);
            }
            else
            {
                tax=20;
                System.out.println("tax percentage-"+tax);
            }
        }
        amt=(double)((tax/100)*basic_pay);
        return amt;
    }
}
