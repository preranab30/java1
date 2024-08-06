//Chocolate: brand,price,flavour,size
class Chocolate
{
	String brand;
	String flavour="chacolate";
	char size;
	int price;
	public Chocolate(String brand)
	{
		this.brand=brand;
	}
	
	public void setsize(char size)
	{
		this.size=size;
	}
	
	public void display()
	{
		System.out.println("brand :"+this.brand);
		System.out.println("flavour :"+this.flavour);
		System.out.println("size :"+this.size);
		System.out.println("price :"+this.price);
	}
}