/*
*  ****
*  *  
*  *  
*******
   *  *
   *  *
****  *

*/
class program109
{
    public static void main(String[] args) 
	{
		int n=5;
        	for (int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1||i==1||(i==n-1)||(j==n-1&&i>=n/2)||(i==n/2&&j<=n/2)||(j==n/2&&i<=n/2))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}			
			