package common;
import java.util.Scanner;
public class ageerrorexception {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        System.out.print("enter id:");
        int i=o.nextInt();
        System.out.print("enter department:");
        String d=o.next();
        boolean flag=true;
        System.out.print("enter age:");
        int a=o.nextInt();
        while(flag)
        {
            try
            {
                if(a>25 &&a<65)
                    flag=false;
                else
                    throw new AgeNotWithinRangeException("ineligible age");
            }
            catch(AgeNotWithinRangeException e)
            {
                System.out.println(e.getMessage());
            }
            if(flag)
            {
                System.out.print("enter age:");
                a=o.nextInt();
            }
        }
        System.out.print("enter name:"); 
        String n=o.next();
        while(!flag)
        {
            char c[]=n.toCharArray();
            try
            {
            for(char s:c)
            {
                if(!Character.isLetter(s))
                {
                    throw new NameNotValidException("invalid name");
                }
            }
            flag=true;
            }
            catch(NameNotValidException e)
            {
                System.out.println(e.getMessage());
            }
            if(!flag)
            {
                System.out.print("enter name:");
                n=o.next();
            }
        }
        Doctor obj=new Doctor(i,n,a,d);
        System.out.println(obj);
    }
    
}
class Doctor
{
    int id;
    String name;
    int age;
    String department;
    Doctor(int i,String n,int a,String d)
    {
        id=i;
        name=n;
        age=a;
        department=d;
    }
    @Override
    public String toString()
    {
        return "id="+id+" name= "+name+" age= "+age+" department= "+department;
    }
}
class AgeNotWithinRangeException extends Exception
{
    AgeNotWithinRangeException(String msg)
    {
        super(msg);
    }
}
class NameNotValidException extends Exception
{
    NameNotValidException(String msg)
    {
        super(msg);
    }
}