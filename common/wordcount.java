package common;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class wordcount {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        int n=o.nextInt();
        String str[]=new String[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter file name:");
            str[i]=o.next();
        }
        for(int i=0;i<n;i++)
        {
            words obj=new words(str[i]);
        }
    }
    
}
class words implements Runnable 
{
    String fb;
    Thread t;
    words(String n)
    {
        fb=n;
        t=new Thread(this);
        t.start();
    }
    public void run() 
    {
        File f=new File(fb);
        FileReader fs;
        try {
            fs = new FileReader(fb);
            BufferedReader bf=new BufferedReader(fs);
            String read;
            int count=0;
            while((read=bf.readLine())!=null)
            {
                String s[]=read.split(" ");
                count+=s.length;
            }
            System.out.println(f.getName()+" : "+count);
        }
        catch (Exception ex) {
            
        }
    }
}