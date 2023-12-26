/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops3;
import java.util.Scanner;
/**
 *
 * @author 21CSE073
 */
public class exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cylinder obj=new cylinder();
        System.out.println(obj);
        System.out.println("radius="+obj.getradius());
        System.out.println("color="+obj.getcolor());
        System.out.println("area="+obj.getarea());
        System.out.println("height="+obj.getheight());
        System.out.println("volume="+obj.getvolume());
        System.out.println();
        Scanner o=new Scanner(System.in);
        System.out.println("enter radius:");
        double r=o.nextDouble();
        System.out.println("enter height:");
        double h=o.nextDouble();
        System.out.println("enter color:");
        String c=o.next();
        cylinder obj1=new cylinder(r,h,c);
        System.out.println("radius="+obj1.getradius());
        System.out.println("color="+obj1.getcolor());
        System.out.println("area="+obj1.getarea());
        System.out.println("height="+obj1.getheight());
        System.out.println("volume="+obj1.getvolume());
        System.out.println(obj1);
        System.out.println();
        obj1.setradius();
        System.out.println();
        obj1.setheight();
        System.out.println();
        obj1.setcolor();
        System.out.println();
        System.out.println("volume="+obj1.getvolume());
        System.out.println(obj1);
    }
    
}

class circle
{
    double radius;
    String color;
    circle()
    {
        radius=1.0;
        color="red";
    }
    circle(double r)
    {
        radius=r;
    }
    circle(double ra,String co)
    {
        radius=ra;
        color=co;
    }
    double getradius()
    {
        return radius;
    }
    void setradius()
    {
        System.out.println("enter new radius value:");
        Scanner o=new Scanner(System.in);
        double rad=o.nextDouble();
        radius=rad;
    }
    String getcolor()
    {
        return color;
    }
    void setcolor()
    {
        System.out.println("enter new color value:");
        Scanner o=new Scanner(System.in);
        String co=o.next();
        color=co;
    }
    double getarea()
    {
        double area;
        area=Math.PI*radius*radius;
        return area;
    }
    @Override
    public String toString()
    {
        return "circle[radius="+radius+",color="+color+"]";
    }
}
 
class cylinder extends circle
{
    double height;
    cylinder()
    {
        super();
        height=1.0;
    }
    cylinder(double ra)
    {
        super(ra);
        radius=ra;
    }
    cylinder(double ra,double he)
    {
        height=he;
        radius=ra;
    }
    cylinder(double ra,double he,String s)
    {
        radius=ra;
        height=he;
        color=s;
    }
    double getheight()
    {
        return height;
    }
    void setheight()
    {
        System.out.println("enter new height value:");
        Scanner o=new Scanner(System.in);
        double rad=o.nextDouble();
        height=rad;
    }
    double getvolume()
    {
        double volume;
        volume=Math.PI*radius*radius*height;
        return volume;
    }
}
