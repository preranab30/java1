//Owner : name,age,gender : constructor
//Declare a method to print details
//Hotel : name:literal, Owner:literal
//Declare a method to print details

class Owner
{
	String name;
	int age;
	char gender;
	
	Owner()
	{
		System.out.println("no argument constructor");
	}
	
	Owner(String name,int age,char gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public void torisu()
	{
		System.out.println("Name :"+this.name);
		System.out.println("Age :"+this.age);
		System.out.println("Gender :"+this.gender);
	}
	
	
	
}