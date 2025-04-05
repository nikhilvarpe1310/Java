class Reading extends Thread
{
	public void reading()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Reading process started");
		}
	}
	public void run()
	{
		reading();
	}
}