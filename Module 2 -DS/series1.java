class series1
{
	static int count=1;
	static int fun(int n)
	{
		
		if(count<=n)
		{
			System.out.println(count);
			count++;
		}
			return 0;
		
		fun(n);
	}

public static void main(String args[])
{
	fun(4);
}
}