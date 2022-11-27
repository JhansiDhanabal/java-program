package common;
import java.util.Scanner;
public class carextends {
    public static void main(String[] args) {
        int n;
        System.out.println("enter number of objects:");
        Scanner o=new Scanner(System.in);
        n=o.nextInt();
        car obj[]=new car[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("   1.transport vehicle");
            System.out.println("   2.private vehicle");
            System.out.println("enter your choice");
            int ch=o.nextInt();
            if(ch==1)
            {
                System.out.println("enter validity no:");
                int v=o.nextInt();
                System.out.println("enter start date:");
                String s=o.next();
                System.out.println("enter period:");
                int p=o.nextInt();
                obj[i]=new transport_vehicle(v,s,p);
                System.out.println(obj[i]);
            }
            if(ch==2)
            {
                System.out.println("enter owner name:");
                String na=o.next();
                System.out.println("enter owner address:");
                String a=o.next();
                obj[i]=new private_vehicle(na,a);
                System.out.println(obj[i]);
            }
        }
    }
    
}


abstract class car
{
    int regno;
    int model;
    String date;
}
class transport_vehicle extends car
{
    int validityno;
    String startdate;
    int period;
    transport_vehicle(int validity,String start,int per)
    {
        validityno=validity;
        startdate=start;
        period=per;
        regno=1;
        model=2021;
        date="09/09/2022";
    }
    @Override
    public String toString()
    {
        return "validity no = "+validityno+" start date = "+startdate+" period ="+period+" regno= "+regno+" model "+model+" date = "+date;
    }
}
class private_vehicle extends car
{
    String owner_name;
    String owner_address;
    private_vehicle(String owner,String address)
    {
        owner_name=owner;
        owner_address=address;
        regno=1;
        model=2021;
        date="09/09/2022";
    }       
    @Override
    public String toString()
    {
        return "owner name = "+owner_name+" address = "+owner_address+" regno= "+regno+" model= "+model+" date = "+date;
    }
}