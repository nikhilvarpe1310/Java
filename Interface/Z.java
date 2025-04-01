//onward java 1.8 version,we can create default method also
class Z implements X,Y
{
	public void m3()
	{
		System.out.println("m3 method of Z");
		X.super.m3();
		Y.super.m3();
	}
}