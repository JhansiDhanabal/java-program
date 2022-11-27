package common;
import java.util.Scanner;
public class exchangeposition {
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
        System.out.println("enter a:");
        Character x=o.next().charAt(0);
        System.out.println("enter b:");
        Character y=o.next().charAt(0);
        exchange<Character>obj=new exchange<>();
        obj.swap(a,x,y);
        System.out.println("array after swaping");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
}
class exchange<T extends Comparable>
{
    T value[];
    public void swap(T arr[],T a,T b)
    {
        value=arr;
        int apos=0;
        int bpos=0;
        for(int i=0;i<value.length;i++)
        {
            if(value[i].compareTo(a)==0)
            {
                apos=i;
            }
            if(value[i].compareTo(b)==0)
            {
                bpos=i;
            }
        }
        value[apos]=b;
        value[bpos]=a;
    }
}