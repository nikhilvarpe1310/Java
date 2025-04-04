class sitethrowsmain
{
	public static void main(String args[])
	{
		System.out.println("Program started");
		sitethrows s = new sitethrows();
		try{
			s.login(30);
		}catch (ArithmeticException|ClassNotFoundException|InstantiationException |InterruptedException e)
		{
			System.out.println(e);	
		}		
		System.out.println("program ended");
	}
}