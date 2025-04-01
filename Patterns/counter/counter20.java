/*
				EO
			IJ	DN
		LF	HI	CM
	NC	KE	GH	BL
OA	MB	JD	FG	AK

Left side
				5
			9	4
		12	8	3
	14	11	7	2
15	13	10	6	1

right side
				15
			10	14
		6	9	13
	3	5	8	12
1	2	4	7	11
*/




class counter20
 {
    public static void main(String args[])
	{
	int n=5;
	int count1=n;
	int count2=(n*(n+1))/2;
	  for(int i1=n;i1>=1;i1--  )
		{
		int c1=count1;
		int c2=count2;
		 for(int j=i1;j>1;j--  )
			{
			System.out.print("\t"); 
			 }
		        for(int j1=i1;j1<=n;j1++ )
			{
			System.out.print((char)(c1+64));
			System.out.print((char)(c2+64));
			System.out.print("\t"); 
			c1-=j1+1;
			c2+=j1;
			}
			 System.out.println();
			 count1+=i1-1;
			 count2-=i1;
			}
		}
	}