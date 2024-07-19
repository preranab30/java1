class contact
{
	public static String phone(long mobilNo)
	{
		System.out.println("running phone in conatact");
		System.out.println("mobileNo" +mobilNo);
		if(mobilNo==9353555400L)
		{
			return "prerana";
		}
		else if(mobilNo==9008973114L)
		{
			return "basavaraj";
		}
		return "Not found";
	}
}