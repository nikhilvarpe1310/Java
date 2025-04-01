class ThisKeyWord
{
	int a=10;
	void display()
	{
		int a=20;
		System.out.println("a="+this.a);
		System.out.println(this);
	}
	ThisKeyWord()
	{
		this(100);
		System.out.println("Default Constructor called");
	}

	ThisKeyWord(int a)
	{
		this.a=a;
		System.out.println("ParaMeterized Constructor called");
	}
	public static void main(String args[])
	{
		ThisKeyWord t1=new ThisKeyWord();
		System.out.println("a="+t1.a);
		t1.display();
	}
}
