package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
public class studentcgpasort {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        int n=o.nextInt();
        student a[]=new student[n];
        ArrayList<student>list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            System.out.println("enter name, rollno, cgpa:");
            String name=o.next();
            String rollno=o.next();
            double cgpa=o.nextDouble();
            a[i]=new student(name,rollno,cgpa);
            list.add(a[i]);
        }
        System.out.println("\nbefore sorting:");
        Iterator<student>itr=list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println("\nafter sorting:");
        Collections.sort(list,new cgpasort());
        Iterator<student>it=list.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
    
}
class cgpasort implements Comparator<student>{
    @Override
    public int compare(student o1, student o2) {
        if(o1.cgpa<o2.cgpa)
            return -1;
        else 
            return 1;
    }
    
}
class student
{
    String name;
    String rollno;
    double cgpa;
    student(String n,String r,double c)
    {
        name=n;
        rollno=r;
        cgpa=c;
    }

    @Override
    public String toString() {
        return "student{" + "name=" + name + ", rollno=" + rollno + ", cgpa=" + cgpa + '}';
    }
    
}