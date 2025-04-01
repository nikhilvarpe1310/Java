//WAP to find max element from array
import java.util.Arrays;
class Program7
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50};
		int max=0;
		int secondMax=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				max=a[i];
			}
			else
			{
				max=a[i+1];
			}
		}
			for(int i=0;i<a.length-1;i++)
			{
				if(a[i]>secondMax && a[i]!=max)
				{
				secondMax=a[i];
				}
			}
		System.out.println(Arrays.toString(a));
		System.out.println("Max element is:"+max);
		System.out.println("secondMax element is:"+secondMax);
	
	}
	

}



 		