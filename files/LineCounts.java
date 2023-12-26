package filehandling;
import java.io.*;
public class LineCounts {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int length=args.length;
        System.out.println(length);
        for(int i=0;i<length;i++)
        {
            String st=args[i];
            File f=new File(st);
            FileReader fr=new FileReader(st);
            BufferedReader br=new BufferedReader(fr);
            String s;
            int count=0;
            while((s=br.readLine())!=null)
            {
                count++;
            }
            System.out.println("file "+f.getName()+" has "+count+" number of lines");
        }
    }
}
