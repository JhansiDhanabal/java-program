/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise5;

/**
 *
 * @author USER
 */
public class payslip extends income{
    public double da;
    public double hra;
    public double pf;
    public double staff_fund;
    public double gross;
    public double net;
    public double dailyallowance()
    {
        da=(double)(0.97*basic_pay);
        return da;
    }
    public double houserentallowance()
    {
        hra=(double)(0.1*basic_pay);
        return hra;
    }
    public double provident_fund()
    {
        pf=(double)(0.12*basic_pay);
        return pf;
    }
    public double staff()
    {
        staff_fund=(double)(0.001*basic_pay);
        return staff_fund;
    }
    public double gross_salary()
    {
        gross=basic_pay+hra+da;
        return gross;
    }
    public double netsalary()
    {
        net=gross-amt-pf;
        return net;
    }
}
