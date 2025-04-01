/*
*******
*  *  *
*  *  *
*******
*  *  *
*  *  *
*******

*/
 class program109
{
    public static void main(String[] args) 
	{
		int n=5;
        	for (int i=1;i<=2*n-3;i++)
		{
			for(int j=1;j<=2*n-3;j++)
			{
				if(i==1||i==4||i==7||j==4||j==7||j==1)
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
			
			