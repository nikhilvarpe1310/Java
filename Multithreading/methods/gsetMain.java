class gsetMain
{
	public static void main(String args[])
	{
		Sites s = new Sites();
		Users u1 = new Users(s);
		Users u2 = new Users(s);
		Users u3 = new Users(s);
		Users u4 = new Users(s);
		Thread t1 = new Thread(u1);
		Thread t2 = new Thread(u2);
		Thread t3 = new Thread(u3);
		Thread t4 = new Thread(u4);
		t1.setName("Mahendra");
		t2.setName("Vaibhav");
		t3.setName("Amit");
		t4.setName("Devmanus");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}