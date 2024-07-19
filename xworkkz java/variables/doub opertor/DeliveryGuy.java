class DeliveryGuy
{
	public static void deliver(String item)
	{
		System.out.println("Runing delivery method in delivery guy");
	    DeliveryVehicle.delivery(item,"Benglore");
		System.out.println("item :" +item);
	}
}