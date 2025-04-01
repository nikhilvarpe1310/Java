/*
WAP to display palindrome words from String
i/p:where is nayan and nitin
o/p:nayan
    nitin

*/

class Program11
{
	public static void main(String args[])
	{
		String s1="where is nayan and nitin";		
		String s2[] = s1.split(" ");
		 for (int i=0;i<s2.length;i++) 
		{
			StringBuilder sb = new StringBuilder(s2[i]);
            		if(s2[i].equals(sb.reverse().toString()))
			{
				System.out.println(s2[i]);
			}
        	}
		

								
	}
}