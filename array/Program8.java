import java.util.Arrays;
class Program8
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,20,10};
		int j=0;
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
			a[j++]=a[i];
			}
		}
			a[j++]=a[a.length-1];
		for(int i=0;i<j;i++)
		{
			System.out.println(a[i]+" ");
		}
	
	}
}