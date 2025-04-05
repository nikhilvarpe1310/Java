class sitethrowsmain
{
	public static void main(String args[])
	{
		System.out.println("Program started");
		site s = new site();
		try{
			s.login(30);
		}catch (ArithmeticException|ClassNotFoundException|InstantiationException |InterruptedException e)
		{
			System.out.println(e);	
		}		
		System.out.println("program ended");
	}
}