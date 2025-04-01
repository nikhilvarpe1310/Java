/*
EE	DI	CL	BN	AO
ID	HH	GK	FM
LC	KG	JJ
NB	MF
OA

LEFT SIDE

5	4	3	2	1
9	8	7	6
12	11	10
14	13
15
right side
5	9	12	14	15
4	8	11	13
3	7	10
2	6
1
*/


class counter24
 {
    public static void main(String args[])
	{
	int n=5;
	int count1=n;
	int count2=n;
	  for(int i1=n,i2=1;i1>=1||i2<=n;i1--,i2++ )
		{
		int c1=count1;
		int c2=count2;
		     for(int j1=i1,j2=n;j1<=1||j2>=i2;j1++,j2--  )
			{
			System.out.print((char)(c1+64));
			System.out.print((char)(c2+64));
			System.out.print("\t"); 
			c1--;
			c2+=j2-1;
			}
			 System.out.println();
			 count1+=i1-1;
			 count2--;
			}
		}
	}