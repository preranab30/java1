class Clip{
	
	String color;
	char type;
	Clip(String color,char type)
	{
		this.color=color;
		this.type=type;
	}
	
	public void show()
	{
		System.out.println("Color :"+color);
		System.out.println("Type :"+type);
	}
	
}