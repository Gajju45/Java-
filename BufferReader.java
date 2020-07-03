import java.io.*;
class BufferReader{
public static void main(String args[]) throws IOException
{
int num1,num2,num3;
float per;
String name;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter Name:");
name=br.readLine();

System.out.println("Physic");
num1=Integer.parseInt(br.readLine());

System.out.println("Chemistry");
num2=Integer.parseInt(br.readLine());

System.out.println("Mathamatics");
num3=Integer.parseInt(br.readLine());

per=(num1+num2+num3)*100/300;
System.out.println("Name="+name );
System.out.println("Average"+per);



}}