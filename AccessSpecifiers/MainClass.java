class MainClass
{
	public static void main(String args[])
	{
	/*	Demo d1=new Demo();//			In Demo class variable a and method display are private.so they can't access from outside the class(scope is within the class) 
		System.out.println(d1.a);
		d1.display(); 
	*/
		Demo2 d2=new Demo2();//		in Demo2 class variable a and method display are default.so they can called from outside and scope is in the same directory.
		System.out.println(d2.a);
		d2.display();
		
		Demo3 d3=new Demo3();
		System.out.println(d3.a);
		d3.display();
	
		Demo4 d4=new Demo4();
		System.out.println(d4.a);
		d4.display();
	}
}