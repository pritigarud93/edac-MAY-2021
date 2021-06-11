class fibbonacci
{
static int n1=0,n2=1,n3=0;
 static void fun(int count)
{
if(count>0)
{
	n3=n1+n2;
	n1=n2;
	n2=n3;
	System.out.print(" "+n3);
	fun(count-1);
}
}
public static void main(String args[])
{
 int count=10;
 System.out.print(n1+" "+n2);// 0 and 1 
 fun(count-2);//Two numbers are already printed
}
}