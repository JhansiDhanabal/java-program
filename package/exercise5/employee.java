package exercise5;
public class employee {
    public String name;
    public String id;
    public String category;
    public String address;
    public String mail;
    public String mobile;
    public double basic_pay;
    public void getstring(String n,String i,String cat,String a,String m,String mo,double basic)
    {
        name=n;
        id=i;
        category=cat;
        address=a;
        mail=m;
        mobile=mo;
        basic_pay=basic;
    }
    @Override
    public String toString()
    {
        return "employee name : "+name+"\n"+"employee id : "+id+"\n"+"address : "+address+"\nsex: "+category+"\nmail_id :"+mail+"\nmobile no : "+mobile+"\nbasic pay : "+basic_pay;
    }
}
