class Demo
{
	void lastDigit(int a)
	{
		System.out.println(a%10);

	}
	int firstDigit(int num)
	{
		while (num >= 10) 
		{
               		num /= 10;
        	}
		return num;

	}
	int sumOfDigit(int num)
	{
		int sum=0;
		while (num > 0) 
		{
            		sum += num % 10; 
           		 num /= 10;                
		}	
			return sum;

	}
		double average(int a, int b, int c)
		{
		    return (a+b+c)/3;
		                
		}
		int reverse(int num)
		{
			int revs=0;
			while (num > 0) 
			{
            		int digit = num % 10;              
			revs = revs * 10 + digit;  
            		num /= 10;          
			}	
			return revs;

	}	
			

	

	
}