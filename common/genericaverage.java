package common;

import java.util.Scanner;

public class genericaverage {
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
        findaverage<Integer>obj=new findaverage<>(a);
        obj.average();
    }
    
}
class findaverage<T extends Number>
{
    T value[];
    findaverage(T a[])
    {
        value=a;
    }
    public void average()
    {
        double sum=0;
        for(int i=0;i<value.length;i++)
        {
            sum+=value[i].doubleValue();
        }
        System.out.println("average="+sum/value.length);
    }
}