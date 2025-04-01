/*
WAP to find longest word from String
i/p:welocome to international airport
o/p:international

*/

class Program9
{
	public static void main(String args[])
	{
		String s1="welocome to international airport";
		//StringBuilder sb = new StringBuilder();
		String s2[] = s1.split(" ");
		String longest = "";
		String smallest = "";
		for(int i=0;i<s2.length;i++)
		{
			if(s2[i].length()>longest.length())
			{
				longest=s2[i];			
			}
			
			
		}
		
			System.out.println("longest word is : " +longest);
								
	}
}