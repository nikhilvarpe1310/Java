class Demo1
{
	int a=10;
	void m1()
	{
		System.out.println("m1 method of Demo1");
	}
}
class Demo2 extends Demo1
{
	int a=20;
	void m1()
	{
		System.out.println("m1 method of Demo2");	
	}
}
class Demo3 extends Demo2
{
	int a=30;
	void m1()
	{
		System.out.println("m1 method of Demo3");
	}
}
class MethodOverRiding
{
	public static void main(String[] args)
	{
		Demo1 d1=new Demo2();
		d1.m1();
		System.out.println(d1.a);
		Demo1 d2=new Demo3();
		System.out.println(d2.a);
		d2.m1();
		
	}
}