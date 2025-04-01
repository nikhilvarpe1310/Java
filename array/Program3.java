//WAP display greater element from average of given array
class Program3
{
	public static void main(String args[])
	{
		int a[]={12,11,67,34,23,75,20};
		double avg=0;
		for(int i=0;i<a.length;i++)
		{
			avg+=a[i];
		
		}
			avg/=a.length;
			System.out.println(+avg);
		for(int i=0;i<a.length;i++)
		{
			if(avg<a[i])
			{
				System.out.println(a[i]);
			}
		}

	
	}

}