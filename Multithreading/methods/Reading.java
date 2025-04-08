class Reading implements Runnable
{
	public void reading()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Reading process started");
			try{
			Thread.sleep(1000);
			}catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
	public void run()
	{
		reading();
	}
}