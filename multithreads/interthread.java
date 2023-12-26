package multithreading;
public class interthread {
    public static void main(String[] args) {
        Thread t=new Thread();
        newthread obj=new newthread("one");
        newthread obj1=new newthread("two");
        try
        {            
            Thread.sleep(1000);
            obj.my_suspend();
            System.out.println("one is suspended");
            Thread.sleep(1000);
            obj1.my_suspend();
            System.out.println("two is suspended");
            Thread.sleep(1000);
            obj.myresume();
            System.out.println("one is resumed");
            Thread.sleep(1000);
            obj1.myresume();
            System.out.println("two is resumed");
            Thread.sleep(1000);
            obj.my_stop();
            System.out.println("one is stoped");
            Thread.sleep(1000);
            obj1.my_stop();
            System.out.println("two is stoped");
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
    
}
class newthread implements Runnable
{
    public String name;
    public Thread t;
    boolean susp=false,stop=false;
    newthread(String n)
    {
        name=n;
        new Thread(this,name).start();
    }
    @Override
    public void run()
    {
        try
        {
            int j=1;
            while(j++<10)
            {
                synchronized(this)
                {
                    while(susp)
                        wait();
                    if(stop)
                        break;
                }
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
    public synchronized void my_suspend()
    {
                susp=true;   
    }
    public synchronized void myresume()
    {
                susp=false;
                notify();
    }
    public synchronized void my_stop()
    {
                susp=false;
                stop=true;
                notify();
    }
}
