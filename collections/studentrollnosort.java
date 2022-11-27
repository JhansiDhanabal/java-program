package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class studentrollnosort {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        int n=o.nextInt();
        students a[]=new students[n];
        ArrayList<students>list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            System.out.println("enter name, rollno, cgpa:");
            String name=o.next();
            String rollno=o.next();
            double cgpa=o.nextDouble();
            a[i]=new students(name,rollno,cgpa);
            list.add(a[i]);
        }
        System.out.println("\nbefore sorting:");
        Iterator<students>itr=list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println("\nafter sorting:");
        Collections.sort(list,new rollnosort());
        Iterator<students>it=list.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
    
}
class rollnosort implements Comparator<students>{
    @Override
    public int compare(students o1, students o2) {
        if((o1.rollno).compareTo(o2.rollno)<0)
            return -1;
        else 
            return 1;
    }
    
}
class students
{
    String name;
    String rollno;
    double cgpa;
    students(String n,String r,double c)
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