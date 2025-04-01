class Product
{
	private int id;
	private String name;
	private double price;
	private char[] img;
	private String category;
	
	public Product setId(int id)
	{
		this.id=id;
		return this;
	}
	public Product setName(String name)
	{
		this.name=name;
		return this;
	} 
	public Product setPrice(double price)
	{
		this.price=price;
		return this;
	}
	public Product setImg(char[] img)
	{
		this.img=img;
		return this;
	}
	public Product setCategory(String category)
	{
		this.category=category;
		return this;
	}
	
	public String toString()
	{
		return "product[id="+id+",name="+name+",price="+price+",img"+img+",category="+category+"]";
	}
	
}