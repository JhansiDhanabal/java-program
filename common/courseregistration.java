package common;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class courseregistration implements ActionListener{
    JFrame f;
    JTextField t1,t2,t3;
    JLabel l1,l2,l3,l4,l5,l6;
    JComboBox c1,c2,c3;
    JButton b;
    courseregistration()
    {
        f=new JFrame();
        l1=new JLabel("Name:");
        l1.setBounds(100, 50, 100, 30);
        l2=new JLabel("Address:");
        l3=new JLabel("Phone Number:");
        l4=new JLabel("Gender:");
        l5=new JLabel("Department:");
        l6=new JLabel("Course:");
        l2.setBounds(100, 100, 100, 30);
        l3.setBounds(100, 150, 100, 30);
        l4.setBounds(100, 200, 100, 30);
        l5.setBounds(100, 250, 100, 30);
        l6.setBounds(100, 300, 100, 30);
        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        String a[]={"C","C++","JAVA","PYTHON"};
        c1=new JComboBox(a);
        String bp[]={"Male","Female"};
        c2=new JComboBox(bp);
        String cp[]={"CSE","ECE","Mech","Civil"};
        c3=new JComboBox(cp);      
        t1.setBounds(300, 50, 100, 30);
        t2.setBounds(300, 100, 100, 30);
        t3.setBounds(300, 150, 100, 30);
        c2.setBounds(300, 200, 100, 30);
        c3.setBounds(300, 250, 100, 30);
        c1.setBounds(300, 300, 100, 30);
        b=new JButton("submit");
        b.addActionListener(this);
        b.setBounds(200, 360, 100, 30);
        f.add(b);
        f.add(c1);
        f.add(c2);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(c3);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new courseregistration();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(f,t1.getText()+", you have successfully enrolled in course name - "+c1.getSelectedItem());
    }
}
