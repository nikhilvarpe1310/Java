/*
55555
 4444
  333
   22
    1
   22
  333
 4444
55555
   
*/
class program79
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=(n*2)-1;i++)
		{
			if(i<=n)
			{
				for(int j=i;j>1;j--)
				{
					System.out.print(" ");
				}
				for(int j=i;j<=n;j++)
				{
					System.out.print(n-i+1);
				}
			}

			else
			{
				for(int j=i;j<(n*2)-1;j++)
				{
					System.out.print(" ");
				}

				for(int j=n;j>=2*n-i;j--)
				{
					System.out.print(i-n+1);
				}
			}
		
			System.out.println();
		}
	}
}
		