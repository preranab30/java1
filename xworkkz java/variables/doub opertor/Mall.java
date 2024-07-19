class  Mall
{
	public static void main(String[] args)
	{
		Mall.information("Garuda Mall");
		Mall.information("Garuda Mall","uday Garundra");
		Mall.purches(33.43,456.678);
		Mall.games("Templerun","online",23456);
		Mall.cone(32.45F,45.87F);
		
	}
	public static void information(String name)
	{
		System.out.println("runing inforamation in mall with 1 String parameter");
		System.out.println("name"+name);
		
	}
	public static void information(String name,String owner)
	{
		System.out.println("runing inforamation in mall with 2 String parameter");
		System.out.println("name"+name);
		
	}
	public static void purches(double price,double product)
	{
		System.out.println("runing inforamation in mall with 2 double parameter");
		System.out.println("price"+price);
		System.out.println("product"+product);
		
	}
	public static void games(String name,String mode,int price)
	{
		System.out.println("runing inforamation in mall with 2 string int  parameter");
		System.out.println("name"+name);
		System.out.println("mode"+mode);
		System.out.println("price"+price);
		
	}
	public static void cone(float length,float weidth)
	{
		System.out.println("runing inforamation in mall with 2 float parameter");
		System.out.println("length"+length);
		System.out.println("weidth"+weidth);
	}
	
	
}
	