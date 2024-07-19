class ShopRunner
{
	public static void main(String[] args)
	{
		if(args.length==4)
		{
		String juiceName=args[0];
		String juiceBrand=args[1];
		String juiceflavour=args[2];
		String juicePrice=args[3];
		String juiceQunatity=args[4];
		
		int convertedInt= Integer.parseInt(juicePrice);
		
		
		Shop.juice(juiceName,juiceBrand,juiceflavour,convertedInt,juiceQunatity);
		}
	
	}
}