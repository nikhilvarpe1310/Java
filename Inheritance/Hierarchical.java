class Hierarchical
{
	public static void main(String args[])
	{
		Son s1=new Son();
		s1.tall();
		s1.handsome();
		//s1.beautiful();			//subsidiary or sibling class can't access each other method they can only access parent and itself.
		Daughter d1=new Daughter();
		d1.tall();
		d1.beautiful();
		//d1.handsome();			//subsidiary or sibling class can't access each other method they can only access parent and itself.
	}
}
class Parent
{
	void tall()
	{
		System.out.println("parent is tall");
	}
}
class Son extends Parent
{
	void handsome()
	{
		System.out.println("son is handsome");
	}
}
class Daughter extends Parent
{
	void beautiful()
	{
		System.out.println("duaghter is beautiful");
	}
}