class ArrayIndex
{
	public static void main(String args[])
	{
		System.out.println("Program Started");
		int a[] = {10,20,30};
		try{
			System.out.println(a[5]);
		 }catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			
			System.out.println("Program ended");
	
	}
}
		