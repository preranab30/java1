class Scopeofvar
{
	public static void main(String[] args)
	{
		String name="prerana";
		String fName="Basavaraj";
		
		{
			System.out.println(name);//works
			int no=5;
			int no1=6;
			//int no=6;//error
		}
		int no=6;
		System.out.println(no);//does not work bcoz it outside the scope
		{
			boolean run=true;
			run=run;
			System.out.println(run);
			
		}
		
	}
}

class Kalki
{
	public static void movie()
	{
		String actor="Prabhas";
		System.out.println(actor);
	}
	public static void main(String[] args)
	{
		movie();
	}
}