package common;
import java.util.Scanner;
public class daysofmonth {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        int month=o.nextInt();
        int year=o.nextInt();
        switch(month)
        {
            case 1:
                System.out.println("JANUARY"+31);
                break;
            case 2:
                if((year%400==0 )|| (year%4==0 && year%100!=0))
                    System.out.println("FEBRUARY"+29);
                else
                    System.out.println("FEBRUARY"+28);
                break;
            case 3:
                System.out.println("MARCH"+31);
                break;
            case 4:
                System.out.println("APRIL"+30);
                break;
            case 5:
                System.out.println("MAY"+31);
                break;
            case 6:
                System.out.println("JUNE"+30);
                break;
            case 7:
                System.out.println("JULY"+31);
                break;
            case 8:
                System.out.println("AUGUST"+31);
                break;
            case 9:
                System.out.println("SEPTEMBER"+30);
                break;
            case 10:
                System.out.println("OCTOBER"+31);
                break;
            case 11:
                System.out.println("NOVEMBER"+30);
                break;
            case 12:
                System.out.println("DECEMBER"+31);
                break;
        }
    }
    
}
