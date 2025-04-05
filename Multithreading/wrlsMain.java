class wrlsMain
{
	public static void main(String args[])
	{
		Writings w = new Writings();
		Readings r = new Readings();
		Listenings l = new Listenings();
		Thread t1 = new Thread(w);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(l);
		t1.start();
		t2.start();
		t3.start();
	}
}