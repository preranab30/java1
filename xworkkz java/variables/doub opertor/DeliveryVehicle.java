class DeliveryVehicle
{
	public static void delivery(String item,String location) 
	{
		System.out.println("Runing delivery method in DeliveryVehicle");
		System.out.println("item" +item);
		System.out.println("location" +location);
		Company.delivery(item,location);
	}
}