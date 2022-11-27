package common;

import java.util.Scanner;

public class genericsort {
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
        sort<Integer>obj=new sort<>(a);
        obj.sort();
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
}
class sort<T extends Comparable>
{
    T value[];
    sort(T a[])
    {
        value=a;
    }
    public void sort()
    {
        T temp;
        for(int i=0;i<value.length;i++)
        {
            for(int j=0;j<value.length;j++)
            {
                if(value[i].compareTo(value[j])<0)
                {
                    temp=value[i];
                    value[i]=value[j];
                    value[j]=temp;
                }
            }
        }
    }
}