/*
5
54
543
5432
54321
*/
class program6
{
	public static void main(String args[])
	{
	int n=5;
	for(int i=n;i>=1;i--)
	{
		for(int j=n;j>=i;j--)
		{
			System.out.print(j);
		}
		System.out.println();
	}
}
}