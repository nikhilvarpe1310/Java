/*
A
bb
CCC
dddd
EEEEE
dddd
CCC
bb
A
*/
class program55
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=(n*2)-1;i++)
		{
			if(i<=n)
			{
				for(int j=1;j<=i;j++)
					if(i%2!=0)
					{
						System.out.print((char)(i+64));
					}
					else
					{
						System.out.print((char)(i+96));
					}
			}
			else
			{
				for(int j=(n*2)-i;j>=1;j--)
					if(i%2!=0)
					{
						System.out.print((char)(2*n-i+64));
					}
					else
					{
						System.out.print((char)(2*n-i+96));
					}
			}
			System.out.println();
		}
	}
}				