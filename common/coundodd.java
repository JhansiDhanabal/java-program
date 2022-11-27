package common;
import java.util.*;
public class coundodd {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        System.out.print("enter size of array:");
        int n=o.nextInt();
        Integer a[]=new Integer[n];
        System.out.println("enter array element:");
        for(int i=0;i<n;i++)
        {
            a[i]=o.nextInt();
        }
        odd<Integer> obj=new odd<>(a);
        obj.count();
    }   
}
class odd<T extends Number>
{
    T value[];
    odd(T a[])
    {
        this.value=a;
    }
    void count()
    {
        int count=0;
        for(int i=0;i<value.length;i++)
        {
            if((value[i].doubleValue())%2!=0)
            {
                count++;
            }
        }
        System.out.println("number of count value:"+count);
    }
}