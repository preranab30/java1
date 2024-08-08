class Country
{
	String name="India";
	String contient="This is country of karnatka";
	State state = new State();
	Country()
	{
		
		System.out.println("Country is created with no argument");
	}
	
	public void torisu()
	{
		System.out.println("Name :"+name);
		System.out.println("Contient :"+contient);
		this.state.torisu();
	}
}