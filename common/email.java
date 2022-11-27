package common;
import java.util.Scanner;
public class email {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        System.out.println("enter firstname:");
        String firstname=o.next();
        System.out.println("enter lastname:");
        String lastname=o.next();
        int n=lastname.length();
        String str2=lastname.substring(n-4, n);
        String str=firstname.substring(0, 3);
        String email=str+"."+str2+"@gmail.com";
        System.out.println(email);
    }
    
}
