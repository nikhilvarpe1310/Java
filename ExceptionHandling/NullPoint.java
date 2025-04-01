class NullPoint
{
	public static void main(String args[])
	{
		System.out.println("Program Started");
		String s1 = null;
		try{
			System.out.println(s1.length());
		 }catch(NullPointerException e)
			{
				System.out.println(e);
			}
			System.out.println("Program ended");
	
	}
}
		