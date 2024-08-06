//Paper : thickness,size,quality,color

class Paper
{
	String thickeness;
	String color;
	char size;
	String quality="Good";
	public Paper(String thickeness)
	{
		this.thickeness=thickeness;
	}
	
	public void setsize(char size)
	{
		this.size=size;
	}
	
	public void display()
	{
		System.out.println("thickeness :"+this.thickeness);
		System.out.println("color :"+this.color);
		System.out.println("size :"+this.size);
		System.out.println("quality :"+this.quality);
	}
}