class Kerosene
{
	double price;
	int quantity;
	boolean quality;
	Kerosene()
	{
		System.out.println("no parameter");
		
	}
	Kerosene(double price,int quantity,boolean quality)
	{
		this.price=price;
		this.quantity=quantity;
		this.quality=quality;
	}
	Kerosene(int quantity )
	{
		
		this.quantity=quantity;
		
	}
	Kerosene(double price)
	{
		this.price=price;
		
	}
	
}