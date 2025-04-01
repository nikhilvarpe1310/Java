class Arithmatic
{
	public static void main(String args[])
	{
		System.out.println("Program Started");
		int a =10,b=0,c=0;
		try{
			c=a/b;
		 }catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			System.out.println(c);
			System.out.println("Program ended");
	
	}
}
		