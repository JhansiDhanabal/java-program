package common;
import common.year_I.year_1;
import common.year_II.year_2;
import java.util.Scanner;
public class student {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        System.out.println("enter rollno");
        String rollno=o.next();
        System.out.println("enter name:");
        String name=o.next();
        int m1=o.nextInt();
        int m2=o.nextInt();
        int m3=o.nextInt();
        int m4=o.nextInt();
        System.out.println("name:"+name);
        System.out.println("rollno:"+rollno);
        year_1 obj=new year_1(m1,m2);
        year_2 obj1=new year_2(m3,m4);
        
    }
}
