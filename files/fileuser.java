package filehandling;
import java.io.*;
import java.util.Scanner;
public class fileuser {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        System.out.println("enter your file name:");
        String s=o.next();
        File f=new File(s);
        System.out.println("File name: "+f.getName());
        System.out.println("Parent name: "+f.getParent());
        System.out.println("Absolute path: "+f.getAbsolutePath());
        System.out.println((f.exists())?"Exists":"Not Exists");
        System.out.println((f.canRead())?"Is Readable":"Not Readable");
        System.out.println((f.canWrite())?"Is Writable":"Not Writable");
        System.out.println("Is "+((f.isDirectory())?" ":" not ")+"Directory");
        if(f.isFile())
            System.out.println("Normal file");
        else
            System.out.println("Might be a named pipe");
        System.out.println((f.isAbsolute())?"Is Absolute":"Not Absolute");
        System.out.println("File last Modified: "+f.lastModified()+"(milli sec)");
        System.out.println("File size: "+f.length()+" Bytes");
    } 
}
