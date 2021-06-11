import java.util.*;
class operation{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of Array :");
	int n=sc.nextInt();
	int a[]=new int[n];
	int i;
	System.out.println("Enter the Elements in array:");
	for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
		
	}
//display
	for(int s:a)
	{
		System.out.print(s+" ");
	}

//search
System.out.println("Search Element :");
int element=sc.nextInt();
int flag=0;
for(i=0;i<n;i++)
	{
	 if(a[i]==element)
	  {	
		
		System.out.println("Element FOUND  AT INDEX : "+i);
          
		flag=1;
		break;
	  }
	}
if(flag==0)
{
	System.out.println("Element NOT FOUND");
}

//delete Element
System.out.println("Element TO delete :");
element=sc.nextInt();

for(i=0;i<n;i++)
	{
	 if(a[i]==element)
	  {	
		
		a[i]=a[i++];
          
	  }
	}
for(int s:a)
	{
		System.out.print(s+" ");
	}

}

}