class AnanyaRunner
{
	public static void main(String[] args)
	{
		Knife knife = new Knife(2.3,8.9);
		Ananya ananya = new Ananya("vivo",knife);
		ananya.display();
		
		Knife knife1 = new Knife(3.3,7.9);
		Ananya ananya1 = new Ananya("Redmi",knife1);
		ananya1.display();
	}

}