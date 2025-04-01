class NumberFormat
{
	public static void main(String args[])
	{
		System.out.println("Program Started");
		String s1 = "4a";
		int num = 0;
		try{
			num = Integer.parseInt(s1);
		 }catch(NumberFormatException e)
			{
				System.out.println(e);
			}
			System.out.println("num"+num);
			System.out.println("Program ended");
	
	}
}
		