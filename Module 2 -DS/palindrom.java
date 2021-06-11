class palindrom
{

static int r=0,sum=0,number;
static int fun(int n)
{
	if(n>0)
	{
		r=n%10;
		sum=sum*10+r;
		fun(n/10);
	}
return sum;
}
public static void main(String args[])
{
	int n=5225;
	int sum=fun(n);
if(n==sum)
	{
		System.out.println("String is Palindrom");
	}
else
	{
		System.out.println("String is not Palindrom");
	}
}
}