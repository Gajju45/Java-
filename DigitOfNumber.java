class  DigitOfNumber{
public static void main(String args[]){
int count=0 ,num=10204565;
while(num>0)
{num=num/10;
count++;
}
System.out.print("Count Number is="+count);
}
}