class paint
{
	public static void main(String[] args)
	{
		System.out.println("Runing main with class")
		paint.draw("dulux paints");
		paint.draw("berger paints","pink");
		paint.draw("berger paints",55.67);
		paint.draw("berger paints","cement paint",5.67);
	}
	public static void draw(String brand)
	
	{
		System.out.println("runinng draw method in paint class with string parameter");
		System.out.println("Brand" +brand);
		
	}
	public static void draw(String brand,String color)
	{
		System.out.println("runinng draw method in paint class with  2 string parameter");
		System.out.println("Brand" +brand);
		System.out.println("Color" +color);
		
	}
	public static void draw(String brand,double price)
	{
		System.out.println("runinng draw method in paint class with  1 string  and 1 double parameter");
		System.out.println("Brand" +brand);
		System.out.println("price" +price);
	}
	public static void draw(String color,String type,double price)
	{
		System.out.println("runinng draw method in paint class with  2 string  and 1 double parameter");
		System.out.println("color" +color);
	    System.out.println("Type" +type);
		System.out.println("price" +price);
	}
	
	
	
}
