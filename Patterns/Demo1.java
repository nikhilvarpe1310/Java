class Demo1
{	
	int lastDigitToFirstDigit(int n)
	{
		int last=n%10;
		int first=n/10;
		int count=0;
	
		int temp=n;
		while(n!=0)
		{
			n/=10;
			count++;
		}
			
		last*=Math.pow(10,count);
		last+=temp;
		return last;	
	}

	int firstDigitToLastDigit(int num)
	{
		
	
		int temp=num;
		while(num>=10)
		{
			num/=10;
			
		}
			
		temp*=10;
		num+=temp;
		return num;
			
	}
	
	int firstAndLastDigitToLastDigit(int n)
	{
		int last=n%10;
		int first=n;
		while(first>=10)
		{
			first/=10;
		}
			
		first*=10;
		first+=last;
		n*=100;
		n+=first;
		return n;
	
	}
		int palindromOfNum(int num)
		{
			int revs=0;
			int temp=num;
			while(num>0) 
			{
            		int digit=num%10;              
			revs*=10;
  			revs+=digit;
            		num /= 10;          
			}
			if(revs==temp)
			{
				System.out.println("Number is Palindrome");
			}
			else
			{
				System.out.println("Number is not Palindrome ");
			}	
			return revs;
		}
		int palindromOfNth(int nth)
		{
			int check=0;
			int count=0;
		
			while(count<nth) 
			{
				check++;
				int revs=0;
				int temp=check;
				int n=check;
            			
			
				while(n>0) 
				{
            			int digit=n%10;              
				revs*=10;
  				revs+=digit;
            			n/=10;          
				}
					if(revs==temp)
					{
						count++;
					}
			}
				return check;
			
			
			
		}
}