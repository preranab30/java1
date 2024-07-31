class SimCard
{
	String name;
	double price;
	String storageCapacity;
	
	SimCard(String nameLocal,double priceLocal,String storageCapacityLocal)
	{
		name=nameLocal;
		price=priceLocal;
		storageCapacity=storageCapacityLocal;
		System.out.println("name:" +name);
		System.out.println("price:" +price);
		System.out.println("storageCapacity:" +storageCapacityLocal);
		
		
	}
}