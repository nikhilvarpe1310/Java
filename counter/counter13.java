/*
1	2	3	4	5
	6	7	8	9
		10	11	12
			13	14
				15
*/
class counter13

{
	public static void main(String args[])
	{
		int n=5;
		int count=1;
		for(int i=n;i>=n;i-- )
		{
			int c=count;
			for(int j=i;j>1;j--)
			{
				System.out.print(" ");
				
			}
			for(int j=1;i<=n;j++)
			{
				System.out.print(count+"\t");
				count+=i;
			}
			System.out.println();
			
		}
	}
}