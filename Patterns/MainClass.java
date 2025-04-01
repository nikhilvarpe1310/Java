class MainClass
{
	public static void main(String args[])
	{
		Demo d1 = new Demo();
		System.out.println("The Last digit is");
		d1.lastDigit(123);
		System.out.println("The first digit is");
		System.out.println(d1.firstDigit(123));
		System.out.println("The sum of digit is");
		System.out.println(d1.sumOfDigit(123));
		System.out.println("The Average of numbers is");
		System.out.println(d1.average(5,6,7));
		System.out.println("The reverse of numbers is");
		System.out.println(d1.reverse(1234));
		
	}
}