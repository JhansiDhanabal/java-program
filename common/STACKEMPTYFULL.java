package common;
import java.util.Scanner;
public class STACKEMPTYFULL {
    public static void main(String[] args) {
       Scanner o=new Scanner(System.in);
       System.out.println("enter size of array:");
       operations op=new operations();
       System.out.println("1.push");
       System.out.println("2.display");
       System.out.println("3.pop");
       System.out.println("4.full");
       System.out.println("5.empty");
       System.out.println("6.exit");
       int i=1;
       while(i==1)
       {
           System.out.println("\nenter your choice:");
           int ch=o.nextInt();
           switch(ch)
           {
               case 1:
                   op.push();
                   break;
               case 2:
                   op.display();
                   break;
               case 3:
                   op.pop();
                   break;
                case 4:
                   op.full();
                   break;
                case 5:
                   op.empty();
                   break;
               case 6:
                   i=0;
                   break;
           }
           
       }
    }
    
}
abstract class stack
{
    abstract void push();
    abstract void pop();
    abstract void display();
    abstract void full();
    abstract void empty();
}
class operations extends stack
{
    int top=-1;
    Scanner o=new Scanner(System.in);
    int n=o.nextInt();
    int s[]=new int[n];
    @Override
    public void push()
    {
        System.out.println("enter number of element to push:");
        int c=o.nextInt();
        System.out.println("enter array elements:");
        for(int i=0;i<c;i++)
        {
           s[++top]=o.nextInt();
        }
    }
    @Override
    public void pop()
    {
        top--;
    }
    @Override
    public void display()
    {   
        for(int i=0;i<=top;i++)
        {
         System.out.print(s[i]+" ");
        }
    }
    @Override
    public void full()
    {
        if((top+1)==n)
        {
            System.out.println("stack is full");
        }
        else
        {
            System.out.println("stack is not full");
        }
    }
    @Override
    public void empty()
    {
        if(top==-1)
        {
            System.out.println("stack is empty");
        }
        else
        {
            System.out.println("stack is not empty");
        }
    }
}
