/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package importing_employee;
import java.util.Scanner;
import exercise5.*;
/**
 *
 * @author USER
 */
public class details {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner o=new Scanner(System.in);
        System.out.println("enter number of employee:");
        int n=o.nextInt();
        for(int i=0;i<n;i++)
        {
        System.out.println("enter employee name:");
        String name=o.next();
        System.out.println("enter emp_id:");
        String id=o.next();
        System.out.println("enter category:");
        String cat=o.next();
        System.out.println("enter address:");
        String add=o.next();
        System.out.println("enter mail:");
        String mail=o.next();
        System.out.println("enter mobile no:");
        String mobile=o.next();
        System.out.println("enter basic pay:");
        double pay=o.nextDouble();
        payslip ob=new payslip();
        System.out.println("- - - - - - - - - - - - - - - - - - - -");
        ob.getstring(name,id,cat,add,mail,mobile,pay);
        System.out.println(ob);
        System.out.println("tax : "+ob.taxpercentage());
        System.out.println("DA : "+ob.dailyallowance());
        System.out.println("HRA : "+ob.houserentallowance());
        System.out.println("PF : "+ob.provident_fund());
        System.out.println("STAFF CLUB FUND : "+ob.staff());
        System.out.println("GROSS SALARY : "+ob.gross_salary());
        System.out.println("NET SALARY : "+ob.netsalary());
        System.out.println("- - - - - - - - - - - - - - - - - - - -");
        }
    }
    
}
