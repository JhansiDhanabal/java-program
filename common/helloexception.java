package common;
import java.util.Scanner;
public class helloexception {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        System.out.print("enter word:");
        try
        {
            String str=o.next();
            if(str.equals("hello"))
                throw new word("hello should not be entered");
            else
                System.out.println("entered string:"+str);
        }
        catch(word e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            System.out.print("enter a:");
            String a=o.next();
            System.out.print("enter b:");
            String b=o.next();
            char c[]=a.toCharArray();
            char d[]=b.toCharArray();
            for(char f:c)
            {
                if(!Character.isDigit(f))
                throw new digit("invalid integer");
            }
            for(char f:d)
            {
                if(!Character.isDigit(f))
                throw new digit("invalid integer");
            }
            System.out.println(a+"+"+b+"="+(Integer.parseInt(a)+Integer.parseInt(b)));
        }
        catch(digit e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
class digit extends Exception
{
    digit(String msg)
    {
        super(msg);
    }
}
class word extends Exception
{
    word(String msg)
    {
        super(msg);
    }
}