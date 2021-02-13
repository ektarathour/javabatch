// blank constructor
class customer
{
int cid;
String cname;
String caddress;
int cmo;
//creating a blank constructor
public customer()
{
cid=101;
cname="ekta";
caddress="nagpur";
cmo=123;
}
public void show()
{
System.out.println("cid=" +cid);
System.out.println("cname=" +cname);
System.out.println("caddress=" +caddress);
System.out.println("cmo=" +cmo);
}
}
class customerex
{
public static void main(String[] args)
{
customer c=new customer();
c.show();
}
}




