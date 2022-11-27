package collections;
import java.util.*;
public class stringoperation {
    
    public static void main(String[] args) {
        String str;
        ArrayList<String>list=new ArrayList<>();
        Scanner o=new Scanner(System.in);
        int n=o.nextInt();
        System.out.println("enter string:");
        for(int i=0;i<n;i++)
        {
            str=o.next();
            list.add(str);
        }
        System.out.println("enter string to append:");
        str=o.next();
        append(str,list);
        System.out.println("enter string and index:");
        str=o.next();
        int ind=o.nextInt();
        insert(str,list,ind);
        System.out.println("enter string to search:");
        str=o.next();
        search(str,list);
        System.out.println("enter character to list:");
        char c=o.next().charAt(0);
        searchfirst(c,list);
        System.out.println(list);
    }
    public static void append(String name,ArrayList list)
    {
        list.add(name);
    }
    public static void insert(String name,ArrayList list,int index)
    {
        list.add(index,name);
    }
    public static void search(String d,ArrayList list)
    {
        Iterator<String>li=list.iterator();
        Boolean flag=true;
        while(li.hasNext())
        {
            if(li.next().equals(d))
            {
                flag=false;
                System.out.println("founded");
                break;
            }
        }
        if(flag)
        {
            System.out.println("Not founded");
        }
    }
    public static void searchfirst(char a,ArrayList<String> list)
    {
        for(String data:list)
        {
            if(data.charAt(0)==a)
            {
                System.out.println(data);
            }
        }
    }
    
}
 