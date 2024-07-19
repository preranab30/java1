class LipStick
{
	public static void brand(String[] brands)
	{
		for(int position=0;position<brands.length;position++)
		{
			System.out.println("start the for loop");
			//String ref1=brands[position];
			//System.out.println("Brands :"+ref1);
			System.out.println("brands:"+brands[position]);
		}
			
	}
	public static void brandBackward(String[] brands)
	{
		for(int position=brands.length-1;position>=0;position--)
		{
			System.out.println("start the for loop");
			//String ref1=brands[position];
			//System.out.println("Brands :"+ref1);
			System.out.println("brands:"+brands[position]);
		}
			
	}
	
	public static void main(String[] args)
	{
		System.out.println("runinnig main ");
		String[] lipstickBrand={"lakme","dazzler","nykaa"};
		LipStick.brand(lipstickBrand);
		LipStick.brandBackward(lipstickBrand);
	}
}