/*
    A
   bbb
  CCCCC
 ddddddd
EEEEEEEEE

*/
 class program89
{
    public static void main(String[] args) 
	{
		int n=5;
        	for (int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				if(i%2!=0)
				{
					System.out.print((char)(i+64));
				}
				else
				{
					System.out.print((char)(i+96));
				}
			}
			System.out.println();	
		   
			 }
		}
}