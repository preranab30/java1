class Keybunch
{
	String material;
	Key key;
	
	Keybunch(String material,Key key)
	{
		this.material=material;
		this.key=key;
	}
	
	public void display()
	{
		System.out.println("material :" +material);
		this.key.show();
	}
}