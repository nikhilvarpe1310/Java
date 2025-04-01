class NegativeArraySize
{
	public static void main(String args[])
	{
		System.out.println("Program Started");
		try{
			int a[] = new int[-1];
		 }catch(NegativeArraySizeException e)
			{
				System.out.println(e);
			}
			
			System.out.println("Program ended");
	
	}
}
		