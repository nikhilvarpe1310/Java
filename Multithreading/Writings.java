class Writings implements Runnable
{
	public void writing()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Writing process started");
		}
	}
	public void run()
	{
		writing();
	}
}