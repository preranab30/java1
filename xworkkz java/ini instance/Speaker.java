//Speaker : brand,size,cost,output
//Rocket: country,speed,fuelCapacity,noOfThrusters
//Chocolate: brand,price,flavour,size
//Projector: company,type,color,weight
//Paper : thickness,size,quality,color
class Speaker
{
	String brand;
	char size;
	int cost;
	String output="give sound";//liters
	
	//constructor
	public Speaker(String brand)
	{
		this.brand=brand;
	}
	
	public void setSize(char size)
	{
		this.size=size;
	}
	
	public void display()
	{
		System.out.println("Brand :"+this.brand);
		System.out.println("Size :"+this.size);
		System.out.println("Cost :"+this.cost);
		System.out.println("output :"+this.output);
	}
}