public class FractionSeries
{
static int i=2;
static float sum=1.0f;
static float fun(int i,int n,float sum)
{
	if(i>n)
	{
		return sum;
	}
	else
	{
		if(i%2==1)
		{
			sum=sum+(float)1/i;
		}
		
		else{
				sum=sum-(float)1/i;
		    }
	}
		
		
	
	return fun(i+1,n,sum);
	
		

}
public static void main(String args[])
{
	int n=3;
	sum=fun(i,n,sum);
	System.out.println(sum);

}
}