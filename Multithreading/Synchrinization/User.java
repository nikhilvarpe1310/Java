class User implements Runnable
{
	private Site site;
	User(Site site){this.site = site;}
	User(){}
	
	public void run()
	{
		site.doReservation();
	}
}