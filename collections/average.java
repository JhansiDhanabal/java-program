package collections;
import java.util.*;
public class average {
    public static void main(String[] args) {
        ArrayList<Integer> list3=new ArrayList<>();
        int a;
        int sum=0;
        System.out.println("Random numbers between 10 and 90:");
        for(int i=0;i<20;i++)
        {
            a=(int)((Math.random()*(90-10)+10));
            System.out.print(a+" ");
            sum+=a;
            list3.add(a);
        }
        double avg=(double)sum/20;
        System.out.println("\nsum="+sum);
        System.out.println("average="+avg);
        display(avg,list3);   
    }
    public static void display(double avg,ArrayList list3)
    {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for(int i=0;i<list3.size();i++)
        {
            if((Integer)(list3.get(i))<avg)
            {
                list1.add((Integer) list3.get(i));
            }
            else
            {
                list2.add((Integer) list3.get(i));
            }
        }
        System.out.println("Below average number list:");
        for(int i=0;i<list1.size();i++)
        {
            System.out.print(list1.get(i)+" ");
        }
        System.out.println("\nAbove average number list:");
        for(int i=0;i<list2.size();i++)
        {
            System.out.print(list2.get(i)+" ");
        }
        System.out.println();
    }
}
