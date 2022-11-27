package common;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
public class miles implements ActionListener{
    JFrame f=new JFrame();
    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1;
    miles()
    {
        l1=new JLabel("MILES:");
        l1.setBounds(50,50,50,200);
        t1=new JTextField();
        t1.setBounds(200,140,150,30);
        l2=new JLabel("KILOMETER:");
        l2.setBounds(50,100,150,300);
        t2=new JTextField();
        t2.setBounds(200,230,150,30);
        b1=new JButton("CONVERT");
        b1.setBounds(150, 300, 170, 29);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        b1.addActionListener(this);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(500,500);
        f.setTitle("CONVERTERS");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }
    public static void main(String[] args) {
        new miles();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String s1=t1.getText();
        double a=Double.parseDouble(s1);
        double b=a*1.609;
        String result=String.valueOf(b);
        t2.setText(result);
        
    }
}