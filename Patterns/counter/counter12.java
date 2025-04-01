/*
15
10	14
6	9	13
3	5	8	12
1	2	4	7	11
*/
class counter12

{
	public static void main(String args[])
	{
		int n=5,count=(n*(n+1))/2;
		for(int i=n;i>=1;i--)
		{
			int c=count;
			for(int j=i;j<=n;j++)
			{
				System.out.print(c+"\t");
				c+=j;
			}
			System.out.println();
			count-=i;
		}
	}
}