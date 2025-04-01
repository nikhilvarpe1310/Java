/*
WAP to sort words from String
i/p:hello i am java developer
o/p:am developer hello i java

*/

class Program10
{
	public static void main(String args[])
	{
		String s1="hello i am java developer";
		//StringBuilder sb = new StringBuilder(s1);
		String s2[] = s1.split(" ");
		java.util.Arrays.sort(s2);
		 for (int i=0;i<s2.length;i++) 
		{
            		System.out.print(s2[i] + " ");
        	}
			System.out.println();
								
	}
}