import a.b.c.d.e.clonenot;
class MainClone
{
	public static void main(String args[])
	{
		System.out.println("program started");
		clonenot c1 = new clonenot();
		c1.a=10;
		clonenot c2 = c1.clone();
		System.out.println(c1.a);
		System.out.println(c2.a);
		System.out.println("program ended");
	}
}