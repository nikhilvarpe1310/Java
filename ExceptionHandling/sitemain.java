class sitemain
{
	public static void main(String args[])
	{
		System.out.println("Program started");
		site s = new site();
		try{
			s.login(70);
		}catch (ArithmeticException e)
		{
			System.out.println(e);	
		}		
		System.out.println("program ended");
	}
}