//Projector: company,type,color,weight
class Projector
{
	String company="Canon";
	String type;
	String color;
	double weight;//liters
	
	//constructor
	public Projector(String type)
	{
		this.type=type;
	}
	
	public void setcolor(String color)
	{
		this.color=color;
	}
	
	public void display()
	{
		System.out.println("company :"+this.company);
		System.out.println("type :"+this.type);
		System.out.println("color :"+this.color);
		System.out.println("weight :"+this.weight);
	}
} 