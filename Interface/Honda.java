class Honda implements Car
{
	public void colour()
	{
		Car.super.colour();
		System.out.println("Available in black color also");
	}
	public void cc()
	{
		System.out.println("1000-1500cc");
	}
	public void type()
	{
		System.out.println("sedan,xuv,hatchback");
	}
}