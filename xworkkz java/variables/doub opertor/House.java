class House
{
	public static void watch(String location)
	{
		System.out.println("Runinng watch method in House");
		Dog.guarding(location);
		System.out.println("location :" +location);
	}
}