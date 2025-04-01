/*
EEEEE
 dddd
  CCC
   bb
    A
   bb
  CCC
 bbbb
AAAAA
*/
class program84
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
				for(int j=n;j>=i;j--)
				{
					if(i%2!=0)
					{
						System.out.print((char)(n-i+1+64));
					}
					else
					{
						System.out.print((char)(n-i+1+96));
					}
				}
			}

			else
			{
				for(int j=i;j<(n*2)-1;j++)
				{
					System.out.print(" ");
				}

				for(int j=n;j>=n*2-i;j--)
				{
					if(i%2!=0)
					{
						System.out.print((char)(n*2-i+64));
					}
					else
					{
						System.out.print((char)(n*2-i+96));
					}
				}
			}
		
			System.out.println();
		}
	}
}
		