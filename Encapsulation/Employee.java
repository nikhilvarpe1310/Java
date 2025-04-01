class Employee
{
	private int id;
	private String name;	
	private String designation;
	private String company;
	private double salary;
	
	//Setter method()
	public void setId(int id)
	{
		this.id=id;
		
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setDesignation(String designation)
	{
		this.designation=designation;
	}
	public void setCompany(String company)
	{
		this.company=company;	
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}

	//getter method()
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public String getDesignation()
	{
		return designation;
	}
	public String getCompany()
	{
		return company;
	}
	public double getSalary()
	{
		return salary;
	}

	//default constructor
	Employee()
	{
	}

	//parameterized or user-defined constructor
	Employee(int id,String name,String designation,String company,double salary)
	{
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.company=company;
		this.salary=salary;
	}
	//toString() method to get all value in one time
	public String toString()
	{
		return "Employee=[id="+id+",name="+name+",designation="+designation+",company="+company+",salary="+salary+"]";
	}
	
}
