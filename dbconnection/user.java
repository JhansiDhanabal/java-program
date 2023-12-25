package books;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.TableModel;
public class user {
    JTable t1,t2;
    JLabel l1,l2;
    JButton b1;
    JComboBox c1;
    JScrollBar s1;
    JFrame f1;
    user()
    {
        f1=new JFrame();
        l1=new JLabel("Online Book Store");
        l1.setFont(new Font("TimesNewRoman",Font.BOLD,30));
        l1.setBounds(50, 70, 500,50);
        l2=new JLabel("Author");
        t1=new JTable();
        String[] columnname={"ID","TITLE","AUTHOR","PRICE","QUANTITY"};
        for(int i=0;i<columnname.length;i++)
        {
            t1.setValueAt(columnname[i], 0, i);
        }
        t2=new JTable();
        for(int i=1;i<columnname.length;i++)
        {
            t2.setValueAt(columnname[i], 0, i);
        }
        b1=new JButton("Book Details");
        c1=new JComboBox();
        s1=new JScrollBar();
    }
    public static void main(String[] args) {
        
    }
    
}
