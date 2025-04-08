class jsMain 
{
	public static void main(String args[])
	{
		Writing w = new Writing();
		Reading r = new Reading();
		Listening l = new Listening();
		Thread t1 = new Thread(w);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(l);
		t1.start();
		t2.start();
		try{
			t1.join(5000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		t3.start();
		 

	
	}
}