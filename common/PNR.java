package common;
import java.sql.*;
import java.util.Scanner;
public class PNR {
    public static void main(String[] args) throws SQLException {
        Connection c=DriverManager.getConnection("jdbc:derby://localhost:1527/PNR");
        Statement st=c.createStatement();
        Scanner o=new Scanner(System.in);
        System.out.println("enter pnr number:");
        String pnr=o.next();
        ResultSet rs=st.executeQuery("Select * from pnr_details where pnrno='"+pnr+"'");
        while(rs.next())
        {
            System.out.println("PNR NUMBER : "+rs.getString("pnrno"));
            System.out.println("FROM : "+rs.getString("source"));
            System.out.println("TO : "+rs.getString("DESTINATION"));
            System.out.println("DATE : "+rs.getString("date"));
            System.out.println("TIME : "+rs.getString("time"));
            System.out.println("CURRENTSTATUS : "+rs.getString("currentstatus"));
            System.out.println("NUMBER OF SEAT AVAILABLE : "+rs.getString("seatnumber"));
        }
        c.close();
    }
    
}
