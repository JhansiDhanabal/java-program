package common;
import java.io.*;
import java.util.Scanner;
public class fileuppertolower {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner o=new Scanner(System.in);
        System.out.println("enter file name to read:");
        String s=o.next();
        FileReader fr=new FileReader(s);
        System.out.println("enter file name to write:");
        String str=o.next();
        FileWriter fw=new FileWriter(str);
        int write;
        int read;
        while((read=fr.read())!=-1)
        {
            if((char)read>='A' && (char)read<='Z')
            {
                fw.write(read+32);
            }
            else
            {
                fw.write(read);
            }
        }
        fw.close();
        fr.close();
    }
    
}
