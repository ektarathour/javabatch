class Animal{}
class Dog2 extends Animal
{//Dog inherits Animal
public static void main(String args[]){
Dog2 d=new Dog2();
System.out.println(d instanceof Animal);//true
}
}