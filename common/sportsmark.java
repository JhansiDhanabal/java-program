package common;

import java.util.Scanner;

public class sportsmark {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        int n=o.nextInt();
        for(int i=0;i<n;i++)
        {
            String na=o.next();
            String r=o.next();
            int m1=o.nextInt();
            int m2=o.nextInt();
            int m3=o.nextInt();
            int p=o.nextInt();
            sports obj=new sports(na,r,m1,m2,m3,p);
            obj.calculate();
        }
        
    }
}
class students
{
    String name;
    String rollno;
    public students(String n,String r)
    {
        name=n;
        rollno=r;
    }
}
class result extends students
{
    int sub1;
    int sub2;
    int sub3;
    public result(String n,String r,int s1,int s2,int s3)
    {
        super(n,r);
        sub1=s1;
        sub2=s2;
        sub3=s3;
    }
}
class sports extends result
{
    int points;
    sports(String n,String r,int s1,int s2,int s3,int p)
    {
        super(n,r,s1,s2,s3);
        points=p;
    }
    public void calculate()
    {
        int sum=0;
        sum=sub1+sub2+sub3+points;
        if(sum/400>0.5)
            System.out.println("total="+sum+" got pass mark");
        else
            System.out.println("total="+sum+" got pass mark");
    }
}