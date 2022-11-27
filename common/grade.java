package common;
import java.util.Scanner; 
public class grade {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a[]= new int [5];
        int sum=0;
        System.out.println("enter five subjects mark:");
        for(int i=0;i<5;i++)
        {
            a[i]=obj.nextInt();
            sum=a[i]+sum; 
        }
        System.out.println("total="+sum);
        double avg= sum/5;
        if(avg>90)
            System.out.println("OUTSTANDING-10-O");
        else if(avg>80)
            System.out.println("EXCELLENT-9-A");
        else if(avg>70)
            System.out.println("VERY GOOD-8-A+");
        else if(avg>60)
            System.out.println("GOOD-7-B+");
        else if(avg>60)
            System.out.println("AVERAGE-6-B");
        else 
            System.out.println("POOR-0-RA");
    }
    
}
