abstract class Bike
{
abstract void run();
{
}
}
class Honda5 extends Bike
{
void run()
{
System.out.println("running safely");
}
public static void main(String[] args)
{
Bike obj=new Honda5();
obj.run();
}
}