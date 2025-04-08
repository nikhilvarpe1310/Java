class Writing implements Runnable
{
	public void writing()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Writing process started");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
	
		}
	}
	public void run()
	{
		writing();
	}
}