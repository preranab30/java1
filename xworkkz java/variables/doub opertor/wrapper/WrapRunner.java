class WrapRunner
{
	public static void main(String[] args)
	{
		if(args.length==4)
		{
		String medicineName=args[0];
		String medicineManfdate=args[1];
		String medicinePrice=args[2];
		String medicineQunatity=args[3];
		
		int convertedInt= Integer.parseInt(medicineManfdate);
		double convertedDouble= Double.parseDouble(medicinePrice);
		
		Wrap.medicine(medicineName,convertedInt,convertedDouble,medicineQunatity);
		}
	}
}