package common.year_II;
public class year_2 {
    int sub3;
    int sub4;
    public year_2(int sul,int sub2)
    {
        this.sub3=sul;
        this.sub4=sub2;
        String sr1=grades(sub3);
        System.out.println(sub3+" mark has grades="+sr1);
        String sr2=grades(sub4);
        System.out.println(sub3+"mark has grades="+sr2);
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
