package generic;
import java.util.Scanner;
public class minimumtype {
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
        minimum<Character>obj=new minimum<>(a);
        obj.min();
    }
    
}
class minimum<T extends Comparable>
{
    T value[];
    minimum(T a[])
    {
        this.value=a;
    }
    public void min()
    {
        T min=value[0];
        for(int i=0;i<value.length;i++)
        {
            if(min.compareTo(value[i])>0)
            {
                min=value[i];
            }
        }
        System.out.println("minimum value = "+min);
    }
}