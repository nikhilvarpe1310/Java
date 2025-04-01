//this code can't compile and run due method ambuglity error.compiler doesn't get which method of which class is called that's why java doesn't allow multiple inheritance.
//NOTE: multiple inheritance is possible by using interface.

class Multiple
{
	public static void main(String[] args)
	{
		C c1=new C();
		c.display();
	}
}
class A
{
	Void display()
	{
	System.out.println("class A");
	}
}
class B
{
	Void display()
	{
	System.out.println("class B");
	}
}
class C extends A ,B
{
	Void display()
	{
	System.out.println("class C");
	}
}