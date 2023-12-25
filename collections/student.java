package collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
public class student {
    public static void main(String[] args) {
        ArrayList <student_detail> list=new ArrayList<>();
        
        Scanner o=new Scanner(System.in);
        System.out.println("enter number of student");
        int n=o.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("enter student "+(i+1)+" details ::");
            System.out.print("   rollno: ");
            String rollno=o.next();
            System.out.print("   name: ");
            String name=o.next();
            System.out.print("   cgpa: ");
            double cgpa=o.nextDouble();
            list.add(new student_detail(rollno,name,cgpa));
        }
        System.out.println("before sorting");
        Iterator <student_detail>i=list.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        Collections.sort(list, new cgpasort());
        System.out.println();
        System.out.println("after sorting");
        Iterator <student_detail>j=list.iterator();
        while(j.hasNext())
        {
            System.out.println(j.next());
        }
    }
}
class cgpasort implements Comparator<student_detail>
{
    @Override
    public int compare(student_detail o1, student_detail o2) {
        if(o1.cgpa>o2.cgpa)
            return -1;
        else
            return 1;
    }
}
class student_detail
{
    String rollno;
    String name;
    double cgpa;
    student_detail(String roll,String na,double cg)
    {
        rollno=roll;
        name=na;
        cgpa=cg;
    }

    @Override
    public String toString() {
        return "Detail{" + "rollno=" + rollno + ", name=" + name + ", cgpa=" + cgpa + '}';
    }
    
}
