class Train
{
	public static int cancel(boolean withCancelTickect)
	{
		if(withCancelTickect)
		{
			return 100;
		}
		else
		{
			return -100;
		}
		//return is not requied
	}
	
	public static String movie(double code)
	{
		if(code>0)
		{
			return "kalki";
		}
		else if(code<=50 && code>0)
		{
			return "kanaka";
		}
		return "KGF";//it requide 
	}
	public static void product( String name)
	{
		if(name=="TV")
		{
			System.out.println("Tv runing in product");
			return; //end the statement
		}
		else
		{
			System.out.println("not found");
			return;
		}
	}
	
	
	public static String chacolateMachine(int price)
	{
		if(price==50)
		{
			return "dairy milk";
		}
		else if(price==100)
		{
			return "silk cadbury";
		}
		return "Not found";
	}
	
	public static String vote(boolean isAdult)
	{
		if(isAdult)
		{
			return "Eligible";
		}
		else
		{
			return "Not Eligible";
		}
	}
		
}