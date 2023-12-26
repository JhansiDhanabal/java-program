/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

import java.util.Scanner;

/**
 *
 * @author 21CSE073
 */
public class password {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner o=new Scanner(System.in);
        System.out.println("welcome to password generation");
        System.out.println("WARNING: It should contain two upper case character, two lower case character and two digit");
        boolean j=true;
        while(j)
        {
            System.out.println("Enter valid password:");
            String n=o.next();
            pass obj1=new pass(n);
            int i=obj1.valid();
            if(i==0)
            {
                System.out.println("valid password");
                j=false;
                break;
            }
            else
            {
                System.out.println("Invalid password");
                System.out.println("WARNING: It should contain two upper case character, two lower case character and two digit");
            }
        }
        
    }
}
class pass
{
    String word;
    pass(String name)
    {
        this.word=name;
    }
    public int valid()
    {
        int lower=0;
        int upper=0;
        int digit=0;
        char c[]=word.toCharArray();
        for(char d:c)
        {
             if(Character.isLowerCase(d))
             {
                 lower++;
             }
             if(Character.isUpperCase(d))
             {
                 upper++;
             }
             if(Character.isDigit(d))
             {
                 digit++;
             }
        }
        if(lower>1 && upper>1 && digit>1)
        {
            return 0;
        }
        else 
        {
            if(lower<2)
                System.out.println("it contain only lower case="+lower);
            if(upper<2)
                System.out.println("it contain only upper case="+upper);
            if(digit<2)
                System.out.println("it contain only digit="+digit);
            return 1;
        }
    }   
}
