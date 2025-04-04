class FinalizeMain
{
	public static void main(String args[])
	{
		System.out.println("program started");
		new FinalizeMain();
		System.gc();
		System.out.println("program ended");
		
	}
	public void finalize()
	{
		System.out.println("finalize method called");
	}
}