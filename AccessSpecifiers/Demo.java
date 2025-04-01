class Demo
{
	private int a=10;
	private void display()
	{
		System.out.println("private method of Demo");
	}
	public static void main(String[] args)
	{
		Demo d1=new Demo();
		System.out.println(d1.a);
		d1.display();
	}
}
