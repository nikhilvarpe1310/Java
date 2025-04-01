//all properties or variables are declared private(it's necessity of encapsulation).
// variables are initialized by chaining rule .benefit of this is we can set or initialize varibles in single attempt and sequence and actual parameters don't matters.remaining value //which we didn't initialized that will be null or zero.
class ProductMainClass
{
	public static void main(String[] args)
	{	
		Product p1=new Product().setName("Laptop").setId(1).setPrice(49999).setImg(new char[]{'a','b'});
		System.out.println(p1);
		Product p2=new Product().setId(2).setName("washing machiene").setPrice(150000).setCategory("electronics");
		System.out.println(p2);
	}
}