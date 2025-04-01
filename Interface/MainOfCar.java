class MainOfCar
{
	public static void main(String[] args)
	{
		Tata t1=new Tata();
		t1.colour();
		t1.cc();
		t1.type();
		System.out.println(t1.maxSpeed);

		Honda h1=new Honda();
		h1.colour();
		h1.cc();
		h1.type();
		System.out.println(t1.maxSpeed);	
	}
}