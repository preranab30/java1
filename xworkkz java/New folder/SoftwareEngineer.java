//SoftwareEnginner: name,experience,designation,salary : constructor
//Declare a method to print details
//Company : id,name,location: constructor ,SoftwareEnginner:literal
//Declare a method to print details
class SoftwareEngineer
{
	String name;
	int experience;
	String designation;
	long salary;
	
	SoftwareEngineer(String name,int experience,String designation,long salary)
	{
		this.name=name;
		this.experience=experience;
		this.designation=designation;
		this.salary=salary;
	}
	public void torisu()
	{
		System.out.println("Name :"+this.name);
		System.out.println("experience :"+this.experience);
		System.out.println("designation :"+this.designation);
		System.out.println("salary :"+this.salary);
	}

	
	
}
