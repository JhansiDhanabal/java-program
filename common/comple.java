package common;
import java.util.Scanner;
public class comple {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        System.out.println("enter real and imaginary complex 1:");
        float r1=o.nextFloat();
        float i1=o.nextFloat();
        complex ob1=new complex(r1,i1);
        System.out.println("enter real and imaginary complex 2:");
        float r2=o.nextFloat();
        float i2=o.nextFloat();
        complex ob2=new complex(r2,i2);
        complex ob=new complex();
        ob.add(ob1, ob2);
        ob.sub(ob1, ob2);
        ob.mul(ob1, ob2);
        ob.div(ob1, ob2); 
    }
}
class complex
{
    float real;
    float imaginary;
    complex()
    {
        real=0;
        imaginary=0;
    }
    complex(float real,float imaginary)
    {
        this.real=real; 
        this.imaginary=imaginary;
    }
    public void add(complex o1,complex o2)
    {
        float real,imaginary;
        this.real=o1.real+o2.real;
        this.imaginary=o2.imaginary+o1.imaginary;
        System.out.println("add="+this.real+"+("+this.imaginary+"i)");
    }
    public void sub(complex o1,complex o2)
    {
        float real,imaginary;
        this.real=o1.real-o2.real;
        this.imaginary=o2.imaginary-o1.imaginary;
        System.out.println("sub="+this.real+"+("+this.imaginary+"i)");
    }
    public void mul(complex o1,complex o2)
    {
        float real,imaginary;
        this.real=o1.real*o2.real-o2.imaginary*o1.imaginary;
        this.imaginary=o2.imaginary*o1.real+o1.imaginary*o2.real;
        System.out.println("mul="+this.real+"+("+this.imaginary+"i)");
    }
    public void div(complex o1,complex o2)
    {
        float real,imaginary;
        float deno=o1.real*o2.real-o2.imaginary*o1.imaginary;
        this.real=(o1.real*o2.real+o2.imaginary*o1.imaginary)/deno;
        this.imaginary=(o1.imaginary*o2.real-o2.imaginary*o1.real)/deno;
        System.out.println("div="+this.real+"+"+this.imaginary+"i");
    }
}