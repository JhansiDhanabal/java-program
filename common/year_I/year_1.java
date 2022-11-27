package common.year_I;
public class year_1 {
    int sub1;
    int sub2;
    public year_1(int sul,int sub2)
    {
        this.sub1=sul;
        this.sub2=sub2;
        String sr1=grades(sub1);
        System.out.println(sub1+" mark has grades="+sr1);
        String sr2=grades(sub2);
        System.out.println(sub2+" mark has grades="+sr2);
    }
    static String grades(int avg)
    {
        if(avg>90)
            return "O";
        else if(avg>80)
            return "A+";
        else if(avg>70)
            return "A";
        else if(avg>60)
            return "B+";
        else if(avg>60)
            return "B";
        else 
            return "RA";
    }
}
