//StringBuilder append() method
class StringBuilderExample
{
public static void main(String[] args)
{
StringBuilder sb=new StringBuilder("Hello");
sb.append("java");//now original string is changed
System.out.println(sb);//print Hello java
}
}