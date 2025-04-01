/*
WAP to shift first character to last from each word of String
i/p:hello i am java developer
o/p:elloh i ma avaj eveloperd

*/

class Program6
{
	public static void main(String args[])
	{
		String s1="hello i am java developer";
		StringBuilder sb = new StringBuilder();
		String s2[] = s1.split(" ");
		for(int i=0;i<s2.length;i++)
		{
		 	sb.append(s2[i].substring(1));
			sb.append(s2[i].charAt(0));
			sb.append(" ");
		}
			System.out.println(sb);

					
	}
}