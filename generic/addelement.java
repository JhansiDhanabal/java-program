package generic;

import java.util.Scanner;

public class addelement {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        System.out.print("enter size of array:");
        int n=o.nextInt();
        Integer a[]=new Integer[100];
        System.out.println("enter array element:");
        for(int i=0;i<n;i++)
        {
            a[i]=o.nextInt();
        }
        insert<Integer>obj=new insert<>(a);
        System.out.println("1. insert\n2.insertlast\n3.insertmiddle\n4.exit");
        int j=1;
        while(j==1)
        {
            System.out.print("enter your choice:");
            int ch=o.nextInt();
        switch(ch)
        {
            case 1:
            {
                System.out.print("enter data :");
                Integer data=o.nextInt();
                n=obj.insertfirst(n,data);
                obj.display(n);
                break;
            }
            case 2:
            {
                System.out.print("enter data :");
                Integer data=o.nextInt();
                n=obj.insertlast(data,n);
                obj.display(n);
                break;
            }
            case 3:
            {
                System.out.print("enter data :");
                Integer data=o.nextInt();
                System.out.print("enter position:");
                int pos=o.nextInt();
                n=obj.insertmiddle(data,n,pos);
                obj.display(n);
                break;
            }
            case 4:
            {
                j=0;
                break;
            }
        }
        }
    }
}
class insert<T>
{
    T value[];
    insert(T a[])
    {
        value=a;
    }
    public int insertfirst(int n,T data)
    {
        for(int i=(n-1);i>=0;i--)
        {
            value[i+1]=value[i];
        }
        n=n+1;
        value[0]=data;
        return n;
    }
    public int insertlast(T data,int n)
    {
        value[n]=data;
        return n+1;
    }
    public int insertmiddle(T data,int n,int pos)
    {
        for(int i=(n-1);i>=pos;i--)
        {
            value[i+1]=value[i];
        }
        value[pos]=data;
        return n+1;
    }
    public void display(int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(value[i]+" ");
        }
        System.out.println();
    }
}