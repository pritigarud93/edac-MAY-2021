class series
{
	static int fun(int n)
	{
		if(n==1)
			return 1;
		else
			System.out.println(n);
			return fun(n-1);
	}

public static void main(String args[])
{
	System.out.println(fun(4));
}
}