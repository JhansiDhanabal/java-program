package javaapplication4;
public class twointeger {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        boolean flag=false;
        try
        {
            if(!(a>=0) || !(b>=0))
                throw new PositiveException("positive number should be entered");
            if(!(b>a))
                throw new PositiveException("second number should be greater");
            flag=true;
        }
        catch(PositiveException e)
        {
            System.out.println(e.getMessage());
        }
        if(flag)
        {
            prime(a,b);
        }
    }   
    static void prime(int a,int b)
    {
        for(int i=a;i<=b;i++)
        {
            int j=0;
            for(int k=1;k<=i;k++)
            {
                if(i%k==0)
                    j++;
            }
            if(j==2)
                System.out.println(i);
        }
    }
}
class PositiveException extends Exception
{
    PositiveException(String msg)
    {
        super(msg);
    }
}