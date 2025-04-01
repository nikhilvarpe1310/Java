class Son implements IndianMother,BritishMother
{
	public void food()
	{
		System.out.println("food method son is called");
		IndianMother.super.food();	
		BritishMother.super.food();
	}
}