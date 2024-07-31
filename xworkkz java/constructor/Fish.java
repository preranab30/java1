class Fish
{
	String name;
	int price;
	Fish(String nameLocal,int priceLocal)
	{
		System.out.println("creating Fish constructor");
		System.out.println("Name:"+name);
		System.out.println("price:"+price);
		System.out.println("NameLocal :"+nameLocal);
		System.out.println("priceLocal :"+priceLocal);
		
		name=nameLocal;
		price=priceLocal;
		System.out.println("updated name:" +name);
		System.out.println("updated price:" +price);
		
	}
	
}