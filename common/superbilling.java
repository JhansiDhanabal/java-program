package common;
import java.sql.*;
import java.util.Scanner;
public class superbilling {
    public static void main(String[] args) throws SQLException {
        Scanner o=new Scanner(System.in);
        System.out.print("enter customer name:");
        String name=o.next();
        System.out.print("enter phone number:");
        String phone=o.next();
       System.out.println("AVAILABLE ITEM");
       System.out.println(" 1.rice");
       System.out.println(" 2.wheat");
       System.out.println(" 3.pulse");
       System.out.println(" 4.basmathi");
       System.out.println("enter number of items");
       int n=o.nextInt();
       String s[]=new String[n];
       int qty[]=new int[n];
       for(int i=0;i<n;i++)
       {
           System.out.println("enter your item:");
           s[i]=o.next();
           System.out.println("enter your quantity:");
           qty[i]=o.nextInt();
       }
       int t=0;
       System.out.println("WELCOME TO AAA STORE\n");
       System.out.println("item         quantity        price       subtotal");
       for(int i=0;i<n;i++)
       {
            Connection c=DriverManager.getConnection("jdbc:derby://localhost:1527/billing");
            Statement st=c.createStatement();
            ResultSet rs=st.executeQuery("Select * from superbilling where item='"+s[i]+"'");
            while(rs.next())
            {
                if(rs.getInt("availablequantity")<qty[i])
                {
                    System.out.println("available quantity is not found");
                }
                else
                {
                    int price=rs.getInt("price");
                    int total=price*qty[i];
                    System.out.println(s[i]+"                "+qty[i]+"           "+price+"           "+total);
                    t+=total;
                }
            }
       }
       System.out.println("                                  total="+t);
       Connection c1=DriverManager.getConnection("jdbc:derby://localhost:1527/customer");
       Statement sts=c1.createStatement();
       
       sts.executeUpdate("insert into customerdetails values('"+name+"',"+t+",'"+phone+"')");
    }
    
}
