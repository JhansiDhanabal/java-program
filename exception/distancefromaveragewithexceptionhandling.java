package javaapplication4;
import java.util.Scanner;
public class DistanceFromAverageWithExceptionHandling {
    public static void main(String[] args) {
        DistanceFromAverage obj=new DistanceFromAverage();
        obj.distance();
    }
    
}
class DistanceFromAverage
{
    public int n;
    public double arr[];
    public boolean flag;
    public int i=0;
    public double avg;
    Scanner o=new Scanner(System.in);
    void distance()
    {
    try
    {
        System.out.println("enter array size:");
        n=o.nextInt();
        arr=new double[n];
        flag=true;
    }
    catch(NegativeArraySizeException e)
    {
        System.out.println("negative numeric value for the sizs");
    }
    catch(NumberFormatException e)
    {
        System.out.println("non numeric value for the sizs");
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    if(flag)
    {
        System.out.println("enter array element:");
        for(i=0;i<n;i++)
        {
            boolean j=false;
            double data=o.nextDouble();
            try
            {
            if((data%1)!=0)
            {
                j=true;
            }
            else
            {
                throw new check("!!! double value should be entered !!!");
            }
            }
            catch(check e)
            {
                System.out.println(e);
            }
            if(j)
            {
                arr[i]=data;
                avg+=arr[i];
            }
        }
        avg=(double)(avg/n);
        System.out.println("average value : "+avg);
        for(i=0;i<n;i++)
        {
            System.out.println("entered value : "+arr[i]+" distance from average : "+(avg-arr[i]));
            
        }
    }
    }
}
class check extends Exception
{
    check(String msg)
    {
        super(msg);
    }
}
