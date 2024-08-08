class State
{
	String name="Karnataka";
	String language="kannada";
	CapitalCity capitalCity = new CapitalCity("Bangluru",300000000);
	State()
	{
	
		System.out.println("no arg cons");
	}
	public void torisu()
	{
		System.out.println("Name :"+this.name);
		System.out.println("Language :"+this.language);
		this.capitalCity.torisu();
	}
}