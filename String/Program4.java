/*WAP to sort vowels from String
input:International
output:Intarnateinol

*/


import java.util.Arrays;

class Program4 
{
    public static void main(String args[]) 
	{
        	String s1 = "International";
        	String s2 = "AEIOUaeiou";
        	StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
        	int vindex = 0;
		for (int i = 0; i < s1.length(); i++) 
		{
            		char ch = s1.charAt(i);
            		if (s2.indexOf(ch) != -1) 
			{
                		sb.append(ch);
            		}
        	}
		char c[]  = sb.toString().toCharArray();
        	Arrays.sort(c);
		for (int i = 0; i < s1.length(); i++) 
		{
            		char ch = s1.charAt(i);
            		if (s2.indexOf(ch) != -1) 
			{
                		sb2.append(c[vindex++]);
            		} 
			else 
			{
                		sb2.append(ch);
            		}
        	}

        
        System.out.println(sb2.toString());
    }
}