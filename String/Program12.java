/*
WAP to count character from String
i/p:hello? where are you?? i am here!!!! thank you!!
o/p:9

*/

class Program12
{
	public static void main(String args[])
	{
		String s1="hello? where are you?? i am here!!!! thank you!!";	
		int count = 0;	
		 for (int i=0;i<s1.length();i++) 
		{
			
            		if(!Character.isLetterOrDigit(s1.charAt(i))  && !Character.isWhitespace(s1.charAt(i)))
			{
				count++;
			}
        	}
		System.out.println(count);								
	}
}