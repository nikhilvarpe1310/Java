/*
i/p: INDIA
o/p:
INDIAIDNI
INDI IDNI
IND   DNI
IN     NI
I       I

*/

class Program5
{
	public static void main(String args[])
	{
		String s1="INDIA";
		for(int i=0;i<s1.length();i++)
		{
			System.out.print(s1.substring(0,s1.length()-i));	
			for(int j=1;j<2*i;j++)
			{
				System.out.print(" ");
			}
			
			System.out.println(new StringBuilder(s1.substring(0,s1.length()-i)).reverse().substring(1));

		}
			
	}
}