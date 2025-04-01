interface Car
{
	int maxSpeed=140;
	default void colour()
	{
		System.out.println("available in white color");
	}	
	void cc();
	void type();
}