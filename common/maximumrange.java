package common;
import java.util.Scanner;
public class maximumrange {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        System.out.print("enter size of array:");
        int n=o.nextInt();
        Character a[]=new Character[n];
        System.out.println("enter array element:");
        for(int i=0;i<n;i++)
        {
            a[i]=o.next().charAt(0);
        }
        System.out.println("enter begin:");
        int x=o.nextInt();
        System.out.println("enter end:");
        int y=o.nextInt();
        maximum<Character>obj=new maximum<>(a);
        obj.max(x,y);
    }
    
}
class maximum<T extends Comparable>
{
    T value[];
    maximum(T a[])
    {
        this.value=a;
    }
    public void max(int begin,int end)
    {
        T max=value[0];
        for(int i=begin;i<=end;i++)
        {
            if(max.compareTo(value[i])<0)
            {
                max=value[i];
            }
        }
        System.out.println("maximum value = "+max);
    }
}