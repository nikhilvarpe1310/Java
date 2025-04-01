/*
				OA
			JC	NB
		FF	IE	MD
	CJ	EI	HH	LG
AO	BN	DN	GL	KK
 
LEFT
				15
			10	14
		6	9	15
	3	5	8	12
1	2	4	7	11
RIGHT
				1
			3	2
		6	5	4
	10	9	8	7
15	14	13	12	11

*/

class counter21
 {
    public static void main(String args[])
	{
	int n=5;
	int count1=(n*(n+1))/2;
	int count2=1;
	  for(int i1=n,i2=1;i1>=1 || i2<=n;i1--,i2++ )
		{
		int c1=count1;
		int c2=count2;
		 for(int j=i1;j>1;j--  )
			{
			System.out.print("\t"); 
			 }
		        for(int j1=i1,j2=i2;j1<=n||j2>=1;j1++,j2-- ) 
			{
			System.out.print((char)(c1+64));
			System.out.print((char)(c1+64));
			System.out.print("\t"); 
			c1+=j1;
			c2++;
			}
			 System.out.println();
			 count1-=i1;
			 count2+=i2+1;
			}
		}
	}