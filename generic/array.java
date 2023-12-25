package generic;
import java.util.Scanner;
public class array {
    public static void main(String[] args){
       Scanner o=new Scanner(System.in);
       System.out.println("enter array size:");
       int n=o.nextInt();
       Integer num[]=new Integer[n];
       System.out.println("enter array element:");
       for(int i=0;i<n;i++)
       {
           num[i]=o.nextInt();
       }
       arrayoperation<Integer> obj=new arrayoperation<>(num);
       obj.odd();
       System.out.println("array:");
       obj.display();
       System.out.println("\nenter a:");
       Integer a=o.nextInt();
       System.out.println("enter b:");
       Integer b=o.nextInt();
       obj.swap(a, b);
       System.out.println("array:");
       obj.display();
       System.out.println("\nmaximum :");
       obj.max(0, num.length);
    }  
}
class arrayoperation<T>
{
    T[] value;
    public arrayoperation(T[] value)
    {
        this.value=value;
    }
    public void odd()
    {
        int count=0;
        for(int i=0;i<value.length;i++)
        {
            int a=(Integer)value[i];
            if(a%2!=0)
            {
                count++;
            }
        }
        System.out.println("Number of odd integer:"+count);
    }
    public void swap(T a,T b)
    {
        int apos=0;
        int bpos=0;
        for(int i=0;i<value.length;i++)
        {
            if(value[i]==a)
            {
                apos=i;
            }
            if(value[i]==b)
            {
                bpos=i;
            }
        }
        value[apos]=b;
        value[bpos]=a;
    }
    public void max(int begin,int end)
    {
        int max=(Integer)value[0];
        for(int i=begin;i<end;i++)
        {
            if(((Integer)value[i])>max)
            {
                max=(Integer)value[i];
            }
        }
        System.out.println(max);
    }
    public void display()
    {
        for(int i=0;i<value.length;i++)
        {
            System.out.print(value[i]+" ");
        }
    }
}
