import java.util.*;
class dw4
{
public static void main(String[] args)
{
int i=1;
char ch='y';
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of n");
int n=sc.nextInt();
System.out.println("number are");
do
{
System.out.println(i);
i++;
}
while(i<=n);
Scanner s=new Scanner(System.in);
System.out.println("do you to continue");
ch=s.next().charAt(0);
while(ch=='y');
System.out.println("\n bye");
}
}
