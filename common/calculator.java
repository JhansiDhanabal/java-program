package common;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class calculator implements ActionListener{
    JFrame f;
    JTextField t1;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b11,b12,b13,b14,b15,b16;
    calculator()
    {
        f=new JFrame();
        t1=new JTextField();
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b0=new JButton("0");
        b11=new JButton("+");
        b12=new JButton("-");
        b13=new JButton("*");
        b14=new JButton("/");
        b15=new JButton("=");
        b16=new JButton("Clr");
        t1.setBounds(100, 50, 200, 30);
        b1.setBounds(100, 100, 50, 50);
        b2.setBounds(150, 100, 50, 50);
        b3.setBounds(200, 100, 50, 50);
        b4.setBounds(250, 100, 50, 50);
        b5.setBounds(100, 150, 50, 50);
        b6.setBounds(150, 150, 50, 50);
        b7.setBounds(200, 150, 50, 50);
        b8.setBounds(250, 150, 50, 50);
        b9.setBounds(100, 200, 50, 50);
        b0.setBounds(150, 200, 50, 50);
        b15.setBounds(200, 200, 50, 50);
        b16.setBounds(250, 200, 50, 50);
        b11.setBounds(100, 250, 50, 50);
        b12.setBounds(150, 250, 50, 50);
        b13.setBounds(200, 250, 50, 50);
        b14.setBounds(250, 250, 50, 50);
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        f.add(t1);
        f.add(b1);f.add(b5);f.add(b9);f.add(b13);
        f.add(b2);f.add(b6);f.add(b0);f.add(b14);
        f.add(b3);f.add(b7);f.add(b11);f.add(b15);
        f.add(b4);f.add(b8);f.add(b12);f.add(b16);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new calculator();
        
    }
    String s1="";
    String s2="";
    String str="";
    char c;
    @Override
    public void actionPerformed(ActionEvent e) {
        String s=e.getActionCommand();
        double d1;
        double d2;
        if((s.charAt(0)>='0' && s.charAt(0)<='9'))
        {
            str+=s;
            if(c=='+'||c=='-'||c=='/'||c=='*')
            {
                s2=s2+s;
                System.out.println(s2);
            }
            else
            {
                s1=s1+s;
                System.out.println(s1);
            }
            t1.setText(str);
        }
        else if(s.equals("Clr"))
        {
            t1.setText("");
            s1="";
            s2="";
            c=' ';
            str="";
        }
        else if(s.charAt(0)=='=')
        {
            d1=Double.parseDouble(s1);
            d2=Double.parseDouble(s2);
            t1.setText(" ");
            if(c=='+')
            {
                double ans=d1+d2;
                t1.setText(String.valueOf(ans));
            }
            if(c=='-')
            {
                double ans=d1-d2;
                t1.setText(String.valueOf(ans));
            }
            if(c=='*')
            {
                double ans=d1*d2;
                t1.setText(String.valueOf(ans));
            }
            if(c=='/')
            {
                double ans=d1/d2;
                t1.setText(String.valueOf(ans));
            }
        }
        else
        {
            str+=s;
            if(s.equals("+"))
            {
                c='+';
            }
            if(s.equals("-"))
            {
                c='-';
            }
            if(s.equals("*"))
            {
                c='*';
            }
            if(s.equals("/"))
            {
                c='/';
            }
            t1.setText(str);
        }
    }
    
}
