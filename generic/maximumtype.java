package generic;
import java.util.Scanner;
public class maximumtype {
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
        maxi<Character>obj=new maxi<>(a);
        obj.max();
    }
    
}
class maxi<T extends Comparable>
{
    T value[];
    maxi(T a[])
    {
        this.value=a;
    }
    public void max()
    {
        T max=value[0];
        for(int i=0;i<value.length;i++)
        {
            if(max.compareTo(value[i])<0)
            {
                max=value[i];
            }
        }
        System.out.println("maximum value = "+max);
    }
}