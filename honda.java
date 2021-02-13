class vehicle
{
void run()
{
System.out.println("vehicle is running");
}
}
class bike extends vehicle
{
void run()
{
System.out.println("bike is running");
}
}
class car extends vehicle
{
void run()
{
System.out.println("car is running");
}
}
class honda
{
public static void main(String[] args)
{
bike obj=new bike();
obj.run();
car obj1=new car();
obj1.run();
}
}