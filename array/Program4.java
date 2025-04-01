//WAP to shift first element to last without using 3rd variable
import java.util.Arrays;
class Program4
{
	public static void main(String args[])
	{
			
		int a[]={10,20,30,40,50};
		for(int i=0;i<a.length-1;i++)
		{
		a[i]+=a[i+1];
		a[i+1]=a[i]-a[i+1];
		a[i]-=a[i+1];
		}
		System.out.println(Arrays.toString(a));	


	}
}
