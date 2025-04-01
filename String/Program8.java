/*
WAP to shift first and last character to last from each word of String
i/p:hello i am java developer
o/p:helloho i amam javaja developerdr

*/

class Program8
{
	public static void main(String args[])
	{
		String s1="hello i am java developer";
		StringBuilder sb = new StringBuilder();
		String s2[] = s1.split(" ");
		for(int i=0;i<s2.length;i++)
		{
			if(s2[i].length()>1)
			{
				sb.append(s2[i]);
				sb.append(s2[i].charAt(0));
				sb.append(s2[i].charAt(s2[i].length()-1));
				sb.append(" ");
			}
			else
			{
				sb.append(s2[i]).append(" ");
			}
		}
		
		
			System.out.println(sb);

					
	}
}