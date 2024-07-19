class Train
{
	public static void main(String[] args)
	{
		Train.book("Bidar","Bengalore");
		Train.book("Bidar","Bengalore",22130);
		Train.book("Bidar","Bengalore",22130,68.98);
		Train.book("Bidar","Bengalore",22130,800.98);
		Train.cancel(23456789L);
		Train.cancel(23456789L,"Bidar","Bengalore");
		
	}
	public static void book(String source,String destination)
	{
		System.out.println("runing book method in class paint");
		System.out.println("source" +source);
		System.out.println("destination" +destination);
	}
	public static void book(String source,String destination,int quality)
	{
		System.out.println("runing book method in class paint with 2 string and one int parameter");
		System.out.println("source" +source);
		System.out.println("destination" +destination);
		System.out.println("quality" +quality);
	}
	public static void book(String source,String destination,int quality,double price)
	{
		System.out.println("runing book method in class paint with 2 string and one int and one double parameter");
		System.out.println("source" +source);
		System.out.println("destination" +destination);
		System.out.println("quality" +quality);
		System.out.println("price" +price);
	}
	public static void cancel(long tickectNo)
	{
		System.out.println("runing cancel method in paint with long parameter");
		System.out.println("tickectNo" +tickectNo);
	}
	public static void cancel(long tickectNo,String source,String destination)
	{
		System.out.println("runing cancel method in paint with long and 2 String parameter");
		System.out.println("tickectNo" +tickectNo);
		System.out.println("source" +source);
		System.out.println("destination" +destination);
	}
	
	
	
	
}