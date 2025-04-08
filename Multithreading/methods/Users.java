class Users implements Runnable
{
	private Sites sites;
	Users(Sites sites){this.sites = sites;}
	Users(){}
	
	public void run()
	{
		Sites.doReservation();
	}
}