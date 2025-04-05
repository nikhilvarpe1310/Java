class Listening extends Thread
{
	public void listening()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("music listening");
		}
	}
	public void run()
	{
		listening();
	}
}