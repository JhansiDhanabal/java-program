package books;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
public class frontpage implements ActionListener{
    JLabel l1;
    JButton b1,b2;
    JFrame f1;
    frontpage()
    {
        f1=new JFrame();
        l1=new JLabel("Online Book Store");
        b1=new JButton("User");
        b2=new JButton("Admin");
        l1.setFont(new Font("TimesNewRoman",Font.BOLD,30));
        l1.setBounds(50, 70, 500,50);
        b1.setBounds(150,150,100,50);
        b2.setBounds(150,250,100,50);
        b1.addActionListener(this);
        b2.addActionListener(this);
        f1.add(l1);
        f1.add(b1);
        f1.add(b2);
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setTitle("Front page");
        f1.setSize(500,500);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new frontpage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(b1.isSelected())
        {
            userdemo obj = new userdemo();
            obj.setVisible(true);   
            obj.show();
        }
        if(b2.isSelected())
        {
            new userdemo().setVisible(true);
        }
    }
}
