class Hotel
{
	String name="Taj Hotel";
	Owner owner = new Owner("Mr.jamsetji",48,'M');
	
	Hotel()
	{
		System.out.println("hotel created with no argument");
	}
	public void torisu()
	{
		System.out.println("Company :"+this.name);
		this.owner.torisu();
	}
}