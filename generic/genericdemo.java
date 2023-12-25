package generic;
import java.util.Scanner;
public class genericdemo {
    public static void main(String[] args) {
       Scanner o=new Scanner(System.in);
       System.out.println("*********Integer***********");
       System.out.println("enter array size:");
       int n=o.nextInt();
       Integer num[]=new Integer[n];
       System.out.println("enter array element:");
       for(int i=0;i<n;i++)
       {
           num[i]=o.nextInt();
       }
       search<Integer> obj=new search<>(num);
       System.out.println("enter element to be searched:");
       Integer b=o.nextInt();
       obj.searching(b);
       System.out.println("*********Double***********");
       System.out.println("enter array size:");
       int nu=o.nextInt();
       Double d[]=new Double[nu];
       System.out.println("enter array element:");
       for(int i=0;i<nu;i++)
       {
           d[i]=o.nextDouble();
       }
       search<Double> obj1=new search<>(d);
       System.out.println("enter element to be searched:");
       Double e=o.nextDouble();
       obj1.searching(e);
       System.out.println("*********String***********");
       System.out.println("enter array size:");
       int no=o.nextInt();
       String s[]=new String[no];
       System.out.println("enter array element:");
       for(int i=0;i<no;i++)
       {
           s[i]=o.next();
       }
       search<String> obj2=new search<>(s);
       System.out.println("enter element to be searched:");
       String p=o.next();
       obj2.searching(p);
       System.out.println("*********Character***********");
       System.out.println("enter array size:");
       int size=o.nextInt();
       Character c[]=new Character[size];
       System.out.println("enter array element:");
       for(int i=0;i<no;i++)
       {
           c[i]=o.next().charAt(0);
       }
       search <Character> obj4 = new search<>(c);
       System.out.println("enter element to be searched:");
       char p1=o.next().charAt(0);
       obj4.searching(p1);
    }
    
}
class search<T extends Comparable>
{
    T[] value;
    search(T[] value)
    {
        this.value=value;
    }
    public void searching(T ele)
    {
        T temp=(T)ele;
        boolean flag=true;
        for(int i=0;i<value.length;i++)
        {
            if(value[i].compareTo(temp)==0)
            {
                flag=false;
                System.out.println(ele+" found at position "+i);
                break;
            }
        }
        if(flag)
        {
            System.out.println(ele+" not found");
        }
    }
}
