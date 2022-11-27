package common;

import java.util.Scanner;

public class queue {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        System.out.println("enter size of queue:");
        int n=o.nextInt();
        int arr[]=new int[100];
        myqueue obj=new myqueue(arr,-1,0,n);
        System.out.println("1.enqueue");
        System.out.println("2.dequeue");
        System.out.println("3.display");
        System.out.println("4.exit");
        int j=1;
        while(j==1)
        {
            System.out.println("enter your choice:");
            int ch=o.nextInt();
            switch(ch)
            {
                case 1:
                    obj.enqueue();
                    break;
                case 2:
                    obj.dequeue();
                    break;
                case 3:
                    obj.display();
                    break;
                case 4:
                    j=0;
                    break;
            }
        }
    }
    
}
interface queueoperation
{
    void enqueue();
    void dequeue();
    void display();
    boolean overflow();
    boolean underflow();
}
class myqueue implements queueoperation
{
    int queue[];
    int rear;
    int front;
    int size;
    myqueue(int a[],int rear,int front,int size)
    {
        queue=a;
        this.rear=rear;
        this.front=front;
        this.size=size;
    }
    @Override
    public void enqueue() {
       if(!overflow())
       {
        Scanner o=new Scanner(System.in);
        System.out.println("enter value:");
        int data=o.nextInt();
        queue[++rear]=data;
       }
    }
    public boolean overflow()
    {
        if(rear==size-1)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    public boolean underflow()
    {
        if(rear==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    @Override
    public void dequeue() {
        if(!underflow())
        {
            front++;
        }
    }
    @Override
    public void display() {
        for(int i=front;i<=rear;i++)
        {
            System.out.println(queue[i]+" ");
        }
    }
    
}