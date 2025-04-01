//WAP to find avg of odd no from array
class Program1
{	
	public static void main(String args[])
	{
		int a[]={17,22,15,20,16,23,27};
		double avg=0;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				avg+=a[i];
				count++;	
			}
			
			
		}
			avg/=count;
			System.out.println("average of add no is:"+avg);

	
	}
}