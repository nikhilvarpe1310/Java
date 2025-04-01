/*
    1
   22
  333
 4444
55555
 4444
  333
   22
    1
*/
class program68
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=(n*2)-1;i++)
		{
			if(i<=n)
			{
				for(int j=i;j<n;j++)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print(i);
				}
			}

			else
			{
				for(int j=i;j>n;j--)
				{
					System.out.print(" ");
				}

				for(int j=n;j>=i-n+1;j--)
				{
					System.out.print(n-(i-n));
				}
			}
		
			System.out.println();
		}
	}
}
		