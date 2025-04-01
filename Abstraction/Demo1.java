abstract class Demo1
{
	int a=10;
	void m1()//non-abstract method
	{
		System.out.println("m1 method of Demo1");
	}
	abstract void m2();//abstract method
	
	Demo1()
	{
		System.out.println("default constructor of Demo1");	
	}
	Demo1(int a)
	{
		System.out.println("para-meterized constructor of Demo1");
	}
}

