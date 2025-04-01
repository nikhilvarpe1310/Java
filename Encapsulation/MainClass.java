class MainClass
{	
	public static void main(String args[])
	{
		Employee e1=new Employee();		// by using setter and getter method
		e1.setId(10);
		e1.setName("Amit Khatke");
		e1.setDesignation("Java Developer");
		e1.setCompany("oracle");
		e1.setSalary(100000);
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getDesignation());
		System.out.println(e1.getCompany());
		System.out.println(e1.getSalary());

		Employee e2=new Employee(11,"Rajeev","Data Scientist","nvidia",200000);//by using user-defined or parameterized constructor and toString() method
		System.out.println(e2);

		//Employee e3=new Employee().setName("Ritesh").setDesignation("python developer");
		//System.out.println(e3);
	}
}