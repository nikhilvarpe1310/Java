//WAP to find max element from array
import java.util.Arrays;
class Program6
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50};
		int max=0;
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
		System.out.println(Arrays.toString(a));
		System.out.println("Maximun element is:"+max);
	
	}
	

}



 		