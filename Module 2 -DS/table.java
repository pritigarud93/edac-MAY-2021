class table
{
static int res=0;
	static void fun(int i)
	{
		if(i<=10)
		{
			res=5*i;
			System.out.println("5 * "+i+"  ="+res);
			i++;
			fun(i);
		}

	}
public static void main(String args[])
{
	fun(1);
}
}