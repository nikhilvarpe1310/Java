abstract class ExampleOfAbstract
{
	int a=10;
	abstract void m1();//abstract method(method don't have body)
	void m2()//method signature
	{
		System.out.println("m2 method of Abstract class");
	}//method body 
	public static void main(String[] args)
	{
		ExampleOfAbstract e1=new ExampleOfAbstract();//		can not be initialized object of abstract class due to incomplete method 
	}
}