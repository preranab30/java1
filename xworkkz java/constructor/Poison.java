//this keyword--point the current location ,used to initialize the instance variables
class Poison
{
	int no;
	double price;
	String name;
	Poison(int no,double price,String name)
	{
		//no=no;--error it always consider only local variables
		this.no=no;
		this.price=price;
		this.name=name;
		System.out.println("poison is created");
	}
}
