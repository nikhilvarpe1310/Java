//in this example we are just inherited the parent class but not overrided the parent's method into child class.we created the object of Rajeev and reffered to Amit class reference.due to upcasting object checks common and Closest method of Object which is created(Rajeev).closest to Rejeev object checks m1 method overrided or not if yes then it calls m1 method of Rajeev class m1() method,else it checks if Ritesh class is Overrided the m1() method or not if yes then it calls m1 method of Ritesh.else at last due to inheritance m1() method is common in both Amit and Rajeev then it calls the Amit class m1() method.
class UpCasting
{
	public static void main(String[] args)
	{
		Amit a1=new Rajeev();
		a1.m1();
		a1.m2();
		a1.m3();
		Ritesh a2=new Rajeev();
		a2.m1();
		a2.m2();
		a2.m3();
		a2.m4();
		a2.m5();
		a2.m6();
	}
}
class Amit
{
	void m1()
	{
		System.out.println("m1 method of Amit");
	}
	void m2()
	{
		System.out.println("m2 method of Amit");
	}
	void m3()
	{
		System.out.println("m3 method of Amit");
	}
}
class Ritesh extends Amit
{
	void m4()
	{
		System.out.println("m4 method of Ritesh");
	}
	void m5()
	{
		System.out.println("m5 method of Ritesh");
	}
	void m6()
	{
		System.out.println("m5 method of Ritesh");
	}
}
class Rajeev extends Ritesh
{
	void m7()
	{
		System.out.println("m7 method of Rajeev");
	}
	void m8()
	{
		System.out.println("m8 method of Rajeev");
	}
	void m9()
	{
		System.out.println("m9 method of Rajeev");
	}
/*	void m1()
	{
		System.out.println("m1 method of Rajeev");
	}
	void m2()
	{
		System.out.println("m2 method of Rajeev");
	}
	void m3()
	{
		System.out.println("m3 method of Rajeev");
	}
*/
}