//StringBuilder insert() method
class StringBuilderExample2
{
public static void main(String[] args)
{
StringBuilder sb=new StringBuilder("Hello");
sb.insert(1,"java");//now original string is changed
System.out.println(sb);//print Hello java
}
}