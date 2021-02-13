//final method
class bike
{
final void run()
{
System.out.println("running");
}
}
class honda3 extends bike
{
void run()
{
System.out.println("running sefaly with 100kmph");
}
public static void main(String[] args)
{
honda3 h=new honda3();
h.run();
}
}