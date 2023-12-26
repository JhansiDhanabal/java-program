import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class scroll implements AdjustmentListener{
    JFrame f;
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1,t2,t3;
    JScrollBar s1,s2,s3;
    Canvas c;
    scroll()
    {
        f=new JFrame();
        l1=new JLabel("Red Color");
        l2=new JLabel("Red Value");
        l3=new JLabel("Green Color");
        l4=new JLabel("Green Value");
        l5=new JLabel("Blue Color");
        l6=new JLabel("Blue Value");
        
        s1=new JScrollBar(JScrollBar.HORIZONTAL, 128, 0, 0, 255);
        l1.setBounds(250, 70, 80, 20);
        l1.setForeground(Color.red);
        s1.setBounds(250, 100, 60, 20);
        l2.setBounds(360, 70, 80, 20);
        l2.setForeground(Color.red);
        t1=new JTextField();
        t1.setBounds(360, 100, 30, 20);
        s2=new JScrollBar(JScrollBar.HORIZONTAL, 128, 0, 0, 255);
        l3.setBounds(250, 120, 80, 20);
        l3.setForeground(Color.green);
        s2.setBounds(250, 150, 60, 20);
        l4.setBounds(360, 120, 80, 20);
        l4.setForeground(Color.green);
        t2=new JTextField();
        t2.setBounds(360, 150, 30, 20);
        s3=new JScrollBar(JScrollBar.HORIZONTAL, 128, 0, 0, 255);
        l5.setBounds(250, 170, 80, 20);
        l5.setForeground(Color.blue);
        s3.setBounds(250, 200, 60, 20);
        l6.setForeground(Color.blue);
        l6.setBounds(360, 170, 80, 20);
        t3=new JTextField();
        t3.setBounds(360, 200, 30, 20);
        s1.addAdjustmentListener(this);
        s2.addAdjustmentListener(this);
        s3.addAdjustmentListener(this);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(s1);
        f.add(s2);
        f.add(s3);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        c=new Canvas();
        c.setBounds(10, 50, 200, 200);
        c.setSize(200,200);
        f.add(c,BorderLayout.EAST);
        f.setLayout(null);
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new scroll();
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        int red=s1.getValue();
        int green=s2.getValue();
        int blue=s3.getValue();
        t1.setText(String.valueOf(red));
        t2.setText(String.valueOf(green));
        t3.setText(String.valueOf(blue));
        c.setBackground(new Color(red,green,blue));
    }  
}
