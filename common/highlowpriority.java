package common;
public class highlowpriority {
    public static void main(String[] args) {
        click lo=new click(Thread.MIN_PRIORITY);
        click hi=new click(Thread.MAX_PRIORITY);      
    }
    
}
class click implements Runnable
{
    int click=0;
    private volatile boolean running=true;
    Thread t;
    click(int p)
    {
        t=new Thread(this);
        t.setPriority(p);
        t.start();
    }
    @Override
    public void run() {
        for(int i=1;i<=10;i++)
        {
            try
        {
            Thread.sleep(100);
            System.out.println(t.getPriority()+"x"+i+"="+i*(t.getPriority()));
        }
        catch(Exception e)
        {
            
        } 
        }
        
    }
}