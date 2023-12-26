package filehandling;
import java.io.*;
import java.util.Scanner;
public class iostream {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner o=new Scanner(System.in);
        System.out.println(" File copy");
        System.out.println("               CHARACTER STREAM");
        System.out.println("enter source file name:");
        String s=o.next();
        FileReader fr=new FileReader(s);
        System.out.println("enter destination file name:");
        String st=o.next();
        FileWriter fr2=new FileWriter(st);
        int i;
        while((i=fr.read())!=-1)
        {
            fr2.write(i);
        }
        fr.close();
        fr2.close();
        System.out.println("                  BYTE STREAM");
        System.out.println("enter source file name:");
        String str=o.next();
        FileInputStream f=new FileInputStream(str);
        System.out.println("enter destination file name:");
        String string=o.next();
        FileOutputStream fb=new FileOutputStream(string);
        int read;
        while((read=f.read())!=-1)
        {
            fb.write(read);
        }
        fr.close();
        fr2.close();
        System.out.println("File Copied Successfully");
    }
    
}
