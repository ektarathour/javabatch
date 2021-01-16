import java.util.Scanner;
class temprature
{
int temp;
public static void main(String[] args)
Scanner sc=new System(System.in);
System.out.println("enter days temprature");
temp=sc.nextInt();
if(temp<0)
{
System.out.println("freezing weather\n");
}
else if(temp<10)
{
System.out.println("very cold weather\n");
}
else if(temp<20)
{
System.out.println(" cold weather\n");
}
else if(temp<30)
{
System.out.println("normal weather\n");
}
else if(temp<40)
{
System.out.println("hot weather\n");
}
else
{
System.out.println("very hot temprature\n");
}
}