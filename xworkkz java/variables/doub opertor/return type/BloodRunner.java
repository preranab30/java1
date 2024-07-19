class BloodRunner
{
	public static void main(String[] bloods)
	{
		System.out.println("running main in BloodRunner");
		String group=Blood.person();
		String name=Blood.name();
		System.out.println("Blood inforamtion "+name);
		double cost=Blood.price();
		boolean hospitalTested=Blood.test();
		boolean sickness=Blood.sick();
		boolean donate=Blood.give();
			
	}
}