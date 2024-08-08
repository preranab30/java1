class Key{
	float weight;
	String brand;
	Key(float weight,String brand)
	{
		this.weight=weight;
		this.brand=brand;
	}
	public void show()
	{
		System.out.println("Weigth :"+weight);
		System.out.println("Brand :"+brand);
	}
}