//WAP to shift vowels at last of String
class Program3
{
	public static void main(String args[])
	{
		String s1="International";
		String s2="AEIOUaeiou";
		StringBuilder sbc = new StringBuilder();
		StringBuilder sbv = new StringBuilder();
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(s2.contains(String.valueOf(ch)))
			{
				sbv.append(ch);	
			}
			else
			{
				sbc.append(ch);
			}
		}
			System.out.println(sbv.toString() + sbc.toString());
	}
}