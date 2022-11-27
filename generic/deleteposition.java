package generic;
import java.util.Scanner;
public class deleteposition {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        System.out.print("enter size of array:");
        int n=o.nextInt();
        Integer a[]=new Integer[100];
        System.out.println("enter array element:");
        for(int i=0;i<n;i++)
        {
            a[i]=o.nextInt();
        }
        delete<Integer>obj=new delete<>(a);
        System.out.print("enter position:");
        int pos=o.nextInt();
        n=obj.delete(n, pos);
        obj.display(n);
    }
    
}
class delete<T>
{
    T value[];
    delete(T a[])
    {
        value=a;
    }
    public int delete(int n,int pos)
    {
        for(int i=pos;i<n;i++)
        {
            value[i]=value[i+1];
        }
        return n-1;
    }
    public void display(int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(value[i]+" ");
        }
        System.out.println();
    }
}