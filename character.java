import java.util.Scanner;
class character
{
public static void main(String[] args)
{
char ch;
Scanner sc=new Scanner(System.in);
System.out.println("enter any character");
ch=sc.next().charAt(0);
if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
{
System.out.println(ch+" is alphabates");
}
else if((ch>='0'&&ch<='9'))
{
System.out.println(ch+" is digit");
}
else
{
System.out.println(ch+" is special symbol");
}
}
}