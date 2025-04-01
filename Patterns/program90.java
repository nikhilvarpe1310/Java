/*
    E
   ddd
  CCCCC
 bbbbbbb
AAAAAAAAA

*/
 class program90
{
    public static void main(String[] args) 
	{
		int n=5;
        	for (int i=n;i>=1;i--)
		{
			for(int j=i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=((n-i+1)*2-1);j++)
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