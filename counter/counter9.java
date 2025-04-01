/*
1
6	2
10	7	3
13	11	8	4
15	14	12	9	5
*/
class counter9
{
	public static void main(String args[])
	{
		int n=5;
		int count=1;
		for(int i=n;i>=1;i--)
		{
			int c=count;
			for(int j=i;j<=n;j++)
			{
				System.out.print(c+"\t");
				c-=j;
			}
			System.out.println();
			count+=i;
		}
	}
}