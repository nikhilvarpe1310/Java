/*
WAP to shift last character to first from each word of String
i/p:hello i am java developer
o/p:ohell i ma ajav rdevelope

*/

class Program7
{
	public static void main(String args[])
	{
		String s1="hello i am java developer";
		StringBuilder sb = new StringBuilder();
		String s2[] = s1.split(" ");
		for(int i=0;i<s2.length;i++)
		{
		 	sb.append(s2[i].charAt(s2[i].length()-1));
			sb.append(s2[i],0,s2[i].length()-1);
			sb.append(" ");
		}
			System.out.println(sb);

					
	}
}