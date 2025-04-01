//WAP to shift count vowels of String
class Program1
{
	public static void main(String args[])
	{
		String s1="International";
		String s2="AEIOUaeiou";
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s2.contains(String.valueOf(s1.charAt(i))))
			{
			count++;
			}
		}
		System.out.println(count);
	}
}