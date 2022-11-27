package collections;
import java.util.*;
public class belowaboveaverage {
    public static void main(String[] args) {
        int n=20;
        ArrayList<Integer>list=new ArrayList<>();
        int a[]=new int[20];
        double sum=0;
        for(int i=0;i<n;i++)
        {
            a[i]=(int)(Math.random()*(90-10)+10);
            System.out.print(a[i]+" ");
            list.add(a[i]);
            sum+=a[i];
        }
        int avg=(int)(sum/20);
        System.out.println("average="+avg);
        average(avg,list);
    }
    public static void average(int avg,ArrayList list)
    {
        ArrayList<Integer>below=new ArrayList<>();
        ArrayList<Integer>above=new ArrayList<>();
        for(int i=0;i<list.size();i++)
        {
            if((int)list.get(i)<avg)
            {
                below.add((Integer) list.get(i));
            }
            else
            {
                above.add((Integer) list.get(i));                
            }
        }
        System.out.println("below average:");
        for(int i=0;i<below.size();i++)
        {
            System.out.print(below.get(i)+" ");
        }
        System.out.println("above average:");
        for(int i=0;i<above.size();i++)
        {
            System.out.print(above.get(i)+" ");
        }
    }
}
