class site
{
	public void login(int age)
	{
		System.out.println("Welcome to our site");
		if(age>=70)
		{
			home();
		}
		else
		{
			throw new ArithmeticException();
		}
		System.out.println("thank you for visit");

	}
	private void home()
	{
		System.out.println("Welcome to your second home");
	}

}