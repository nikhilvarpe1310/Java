////WAP to find avg of odd and even no from array
class Program2
{
	public static void main(String args[])
	{
		int a[]={14,13,12,10,44,23,56};
		double oddavg=0;
		double evenavg=0;
		int oddcount=0;
		int evencount=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				oddavg+=a[i];
				oddcount++;
				
			
			}
			else
			{
				evenavg+=a[i];
				evencount++;	
			
			}
	
		
		} 
			System.out.println("Average of odd no is:"+oddavg/oddcount);
			System.out.println("Average of odd no is:"+evenavg/evencount);
	
		
	}
}