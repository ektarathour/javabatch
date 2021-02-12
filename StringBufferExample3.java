class StringBufferExample3
{
public static void main(String[] args)
{
StringBuffer sb=new StringBuffer("Hello");
sb.replace(1,3,"java");//now original string is changed
System.out.println(sb);
}
}