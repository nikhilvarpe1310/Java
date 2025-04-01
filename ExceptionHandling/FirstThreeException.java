class FirstThreeException
{
	/* public static void main(String[] args)
	{
		System.out.println("program started");
		try{
		Class.forName("a.b.c.d.e.Demo");
		}catch(ClassNotFoundException e){
			System.out.println(e);
		}
		System.out.println("Program ended");
	}
	*/
	public static void main(String[] args)
	{
		System.out.println("program started");
		try{
		Class c=Class.forName("a.b.c.d.e.Demo");
		a.b.c.d.e.Demo d1=(a.b.c.d.e.Demo)c.newInstance();
		d1.a=10;
		d1.display();
		}catch(ClassNotFoundException|InstantiationException|IllegalAccessException e){
			System.out.println(e);
		}	
		System.out.println("program ended");
	}
}