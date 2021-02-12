interface Printable
{
}
class A implements  Printable
{
public void a()
{
System.out.println("a method");
}
}
class B implements Printable
{
public void b()
{
System.out.println("b mthod");
}
}
class call
{
void invoke(Printable p)
{
if(p instanceof A)
{
A a=(A)p;
a.a();
}
if(p instanceof B)
{
B b=(B)p;
b.b();
}
}
}
class Test4
{
public static void method(String[] args)
{
Printable p=new B();
call c=new call();
c.invoke(p);
}
}