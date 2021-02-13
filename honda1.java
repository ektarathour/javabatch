//final method
class bike
{
final void run()
{
System.out.println("running");
}
}
class honda2 extends bike
{
void run()
{
System.out.println("running sefaly with 100kmph");
}
public static void main(String[] args)
{
honda2 h=new honda2();
h.run();
}
}