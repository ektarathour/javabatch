import java.util.Scanner;
class height
{
public static void main(String[] args)
{
int m;
Scanner sc=new Scanner(System.in);
System.out.println("enter the height");
m=sc.nextInt();
if(m>175)
{
System.out.println("the person is fail");
}
else if(m>55&&m<=75)
{
System.out.println("the person has average height");
}
else
{
System.out.println("the person is dwarf");
}
}
}
