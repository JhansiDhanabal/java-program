package generic;
import java.util.Scanner;
public class search {
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
        System.out.print("enter search element:");
        searching<Integer> obj=new searching<>(a);
        Integer x=o.nextInt();
        obj.search(x);
    }
    
}
class searching<T extends Comparable>
{
    T value[];
    searching(T a[])
    {
        this.value=a;
    }
    public void search(T x)
    {
        int pos;
        boolean flag=true;
        for(int i=0;i<value.length;i++)
        {
            if(value[i].compareTo(x)==0)
            {
                pos=i;
                flag=false;
                System.out.println(x+" found at position "+pos);
                break;
            }
        }
        if(flag)
        {
            System.out.println(x+" not founded");
        }
    }
}