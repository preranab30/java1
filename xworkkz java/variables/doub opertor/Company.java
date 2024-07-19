//company--->deliver(String item,String location)
//DeliveryVehicle---->deliver(String item,String location)----->company..deliver(item,location);
//DeliveryGuy--->deliver(String item)_--->DeliveryVehicle.deliver(item,"FIXED")
// main()-->DeliveryGuy.deliver("item")
class Company
{
	public static void delivery(String item,String location)
	{
		System.out.println("Runinng delivermethod in company");
		System.out.println("item" +item);
		System.out.println("location" +location);
	}
}