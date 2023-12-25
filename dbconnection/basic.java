package books;
import java.sql.*;
public class basic {
    public static void main(String[] args) throws SQLException {
        Connection c=DriverManager.getConnection("jdbc:derby://localhost:1527/ebookshop");
        Statement st=c.createStatement();
        ResultSet rs=st.executeQuery("Select * from BOOKS");
        while(rs.next())
        {
            System.out.print("id="+rs.getInt(1)+" ");
            System.out.print("title="+rs.getString(2)+" ");
            System.out.print("author="+rs.getString(3)+" ");
            System.out.print("price="+rs.getDouble(4)+" ");
            System.out.print("quantity="+rs.getInt(5));
            System.out.println();
        }
        System.out.println("**********************");
        ResultSet r=st.executeQuery("Select title,author,price,qty from BOOKS where AUTHOR='tan ah teck'");
        while(r.next())
        {
                System.out.print("title="+r.getString(1)+" ");
                System.out.print("author="+r.getString(2)+" ");
                System.out.print("price="+r.getDouble(3)+" ");
                System.out.print("quantity="+r.getInt(4));
                System.out.println();
        }
        st.executeUpdate("Update books set price=price+0.50*price where title='a cup of java'");
        st.executeUpdate("Insert into BOOKS values(8001, 'Java ABC', 'Kevin Jones', 15.55, 55)");
        st.executeUpdate("Insert into BOOKS values(8002, 'Java XYZ','Kevin Jones',25.55,55)");
        st.executeUpdate("Delete from books where id=8001");
    }
   
}
