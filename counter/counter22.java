/*
OO	NJ	LF	IC	EA
MN	KI	HE	DB
JM	GH	CD	
FL	BG
AK

LEFT SIDE

15	14	12	9	5
13	11	8	4
10	7	3
6	2
1

right side
15	10	6	3	1
14	9	5	2
13	8	4
12	7
11	

*/


class counter22
 {
    public static void main(String args[])
	{
	int n=5;
	int count1=(n*(n+1))/2;
	int count2=(n*(n+1))/2;
	  for(int i1=1;i1<=n;i1++  )
		{
		int c1=count1;
		int c2=count2;
		     for(int j1=i1,j2=n;j1<=n||j2>=i1;j1++,j2-- )
			{
			System.out.print((char)(c1+64));
			System.out.print((char)(c2+64));
			System.out.print("\t"); 
			c1-=j1;
			c2-=j2;
			}
			 System.out.println();
			 count1-=i1+1;
			 count2--;
			}
		}
	}