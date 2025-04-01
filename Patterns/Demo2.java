class Demo2
{
	boolean checkPrime(int n)
	{
		Boolean status=false;
		if(n==0||n==1)
		status=true;
		else
		for(int i=2;i<=n/2;i++)
			if(n%i==0)
			{
				status=true;
				break;
			}
		return !status;
	}

	int findNthPrimeNumber(int nth)
	{
		int a=0,count=0;
		while(true)
		{
			if(checkPrime(a))
			count++;
			if(count==nth)
			{
				return a;
			}
			a++;
		}
	
	
	}
}