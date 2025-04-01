class Student
{
	private int rollNo;
	private String name;
	private String department;
	private double percentage;
	private String bloodGroup;

	Student(){}
	
	Student(int rollNo,String name,String department,double percentage,String bloodGroup)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.department=department;
		this.percentage=percentage;
		this.bloodGroup=bloodGroup;
	}

	public String toString()
	{
		return "Student[rollNo="+rollNo+",name="+name+",department="+department+",percentage="+percentage+",bloodGroup="+bloodGroup+"]";
	}
}
