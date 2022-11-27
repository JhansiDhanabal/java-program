package common;
public class TestThreadMany {
    public static void main(String[] args){
        int a=Integer.parseInt(args[0]);
        String s;
        System.out.println("$ javaTestThreadMany "+a);
        for(int i=1;i<=a;i++)
        {
            s=Integer.toString(i);
            newthread obj=new newthread(s);
            try
            {
                 Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    } 
}
class newthread extends Thread
{
    String name;
    Thread t;
    newthread(String n)
    {
        name=n;
        new Thread(this,name).start();
    }
    @Override
    public void run()
    {
        System.out.println("Hello, I am Thread #"+Thread.currentThread().getName());
    }
}