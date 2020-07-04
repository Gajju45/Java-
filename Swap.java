class Swap{
public static void main(String arg[])
{
int a=20,b=10;
System.out.print("Before Swap\n");
System.out.print("a="+a +"\n"+ "b="+b);
//without Third Variable
a=a+b;//a=30
b=a-b;//b=30-10=20
a=a-b;//30-20=10
System.out.print("\nAfter Swap\n");
System.out.print("a="+a +"\n"+ "b="+b);
}}

//with Third Variable
//c=a;
//a=b;
//b=c;
