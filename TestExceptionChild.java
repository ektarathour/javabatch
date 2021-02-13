//import java.io.*;
class Parent1
{
void msg()
{
System.out.println("parent");
}
}
class TestExceptionChild extends Parent
{
void msg()
throws IOException
{
System.out.println("TestExceptionChild");
}
public static void main(String[] args)
{
Parend p=new TestExceptionChild();
p.msg();
}
}//generate compile time arror
