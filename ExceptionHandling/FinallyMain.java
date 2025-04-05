class FinallyMain
{
	public static void main(String args[])
	{
		System.out.println("program started");
		String s1 = null;
		try{
			System.out.println(s1.length());
			}catch(NullPointerException e)
			{
				System.out.println(e);	
			} finally
				System.out.println("finally blocked");
			}
				System.out.println("program ended");
			
	}
}