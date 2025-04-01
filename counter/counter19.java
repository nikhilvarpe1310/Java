/*
Double counterr program

AO	FM	JJ	MF	QA
	BN	GK	KG	NB
		CL	HH	LC
			DI	ID
				EE
Left
1	6	10	13	15     
	2	7	11	14
		3	8	12
			4	9
Right				5

15	13	10	6	1
	14	11	7	2
		12	8	3	
			9	4
				5
*/class counter19
 {
    public static void main(String args[])
	{
	int n=5;
	int count1=1;
	int count2=(n*(n+1))/2;
	  for(int i1=1;i1<=n;i1++  )
		{
		int c1=count1;
		int c2=count2;
		 for(int j=i1;j>1;j-- )
			{
			System.out.print("\t"); 
			 }
		        for(int j1=n,j2=i1;j1>=i1||j2<=1;j1--,j2++  )
			{
			System.out.print((char)(c1+64));
			System.out.print((char)(c2+64));
			System.out.print("\t"); 
			c1+=j1;
			c2-=j2+1;
			}
			 System.out.println();
			 count1++;
			 count2-=i1;
			}
		}
	}